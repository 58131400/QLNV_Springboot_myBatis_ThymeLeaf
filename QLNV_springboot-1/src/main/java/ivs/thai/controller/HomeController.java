package ivs.thai.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import ivs.thai.Util.MyBatisUtil;
import ivs.thai.domain.user.UserPrincipal;
import ivs.thai.model.Nhanvien;
import ivs.thai.model.ThanhtichKiluat;
import ivs.thai.model.User;
import ivs.thai.myBatis.Mapper.NhanvienMapper;
import ivs.thai.service.UserService;


@Controller
public class HomeController {

	@Autowired
	private NhanvienMapper nhanvienMapper;
	@Autowired
	private UserService userService;

	SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
	
	public int tinhDiemThuong(String manv) {
		int tongdiem = 0;

		List<ThanhtichKiluat> result = session
				.selectList("ivs.thai.myBatis.Mapper.ThanhtichKiluatMapper.selectByExample", null);
		for (ThanhtichKiluat tt : result) {
			if (tt.getManv().equals(manv)) {
				if (tt.getLoai() == false)
					tongdiem -= 1;
				else
					tongdiem += 1;
			}
		}
		System.out.println(tongdiem);
		return tongdiem;
	}

	public HashMap<Nhanvien, Integer> map_NV_diem() {

		HashMap<Nhanvien, Integer> m_nv_diem = new HashMap<Nhanvien, Integer>();
		List<Nhanvien> listNV = session.selectList("ivs.thai.myBatis.Mapper.NhanvienMapper.selectByExample", null);
		for (Nhanvien nhanvien : listNV) {
			m_nv_diem.put(nhanvien, tinhDiemThuong(nhanvien.getManv()));
		}
		return m_nv_diem;
	}

	/**
	 * @param Hashmap map_NV_diem
	 * @return hashmap sorted top 10
	 */
	public HashMap<Nhanvien, Integer> getTopTen(HashMap<Nhanvien, Integer> map_NV_diem) {
		HashMap<Nhanvien, Integer> sorted_top10 = map_NV_diem.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(10) // lấy top 10
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		;
		System.out.println("map sau khi sort" + sorted_top10);
		return sorted_top10;
	}

	@RequestMapping(value = { "/", "/home" })
	public String index(Model model) {

//	//kiểm tra có login không? nếu không trả về trang chưa 
//	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//
//		if(auth instanceof AnonymousAuthenticationToken)
//			return "/user/homeNotSignedIn";
//		else 
//			{
//			UserPrincipal userPrincipal =  (UserPrincipal)auth.getPrincipal();
//			//model.addAttribute("userName", "Welcome "+ userPrincipal.getUsername());
//			model.addAttribute("userprincipal",userPrincipal);
//				return "user/homeSignedIn";
//			}

		model.addAttribute("result", getTopTen(map_NV_diem()));
		return "user/homeSignedIn";
	}

	// Trang admin/home
	@RequestMapping(value = { "/admin/home" })
	public String indexAdmin(ModelMap model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		UserPrincipal userPrincipal = (UserPrincipal) auth.getPrincipal();
		System.out.println(userPrincipal.getUsername());

//		model.addAttribute("userName", "Welcome "+ userPrincipal.getUsername());
		List<Nhanvien> nv = nhanvienMapper.selectByExample(null);
		model.addAttribute("nhanviens", nv);

		return "admin/home";
	}

	// trang edit

	@RequestMapping("/create")
	public String Create(@ModelAttribute("nhanvien") Nhanvien nv) {

		return "create";
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String XuLyCreate(@ModelAttribute("nhanvien") Nhanvien nhanvien, HttpServletRequest req,
			@RequestParam("file") MultipartFile file) throws IOException {

		String uploadRootPath = req.getServletContext().getRealPath("images");
		System.out.println("uploadRootPath=" + uploadRootPath);
		File uploadRootDir = new File(uploadRootPath);
		// Tạo thư mục gốc upload nếu nó không tồn tại.
		if (!uploadRootDir.exists()) {
			uploadRootDir.mkdirs();
		}
		if (file.isEmpty()) {
			System.out.println("khong co file");
		}

		// Root Directory.
		String name = file.getOriginalFilename();
		File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + name);
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
		stream.write(file.getBytes());
		stream.close();

		nhanvien.setHinhanh(file.getOriginalFilename());

		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.update("ivs.thai.myBatis.Mapper.NhanvienMapper.insertSelective", nhanvien);
		session.commit();
		session.close();

		return "redirect:/admin/home";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String XuLyDelete(HttpServletRequest req) {

		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		session.update("ivs.thai.myBatis.Mapper.NhanvienMapper.deleteByPrimaryKey", req.getParameter("manv"));
		session.commit();
		session.close();
		return "redirect:/admin/home";
	}

	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}

	@GetMapping("registration")
	public ModelAndView getRegistrationPage() {
		ModelAndView modelAndView = new ModelAndView();
		User user = new User();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("/registration");
		return modelAndView;
	}

	@PostMapping("registration")
	public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) throws IOException {
		ModelAndView modelAndView = new ModelAndView();

		User userExists = userService.findUserByUsername(user.getUsername());
		if (userExists != null) {
			bindingResult.rejectValue("username", "error.username",
					"There is already a user registered with the username provided");
		}
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("/registration");
		} else {
			userService.saveUser(user);
			modelAndView.addObject("successMessage", "User has been registered successfully");
			modelAndView.addObject("user", new User());
			modelAndView.setViewName("/registration");
		}
		return modelAndView;
	}

	@GetMapping("exception")
	public ModelAndView getUserPermissionExceptionPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/access-denied");
		return mv;
	}

}
    
