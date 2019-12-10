package ivs.thai.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ivs.thai.Util.MyBatisUtil;
import ivs.thai.model.Nhanvien;


@Controller
public class NhanVienController {

	
	@GetMapping("/edit")   
	public String edit(ModelMap model, HttpServletRequest req) 
	{		
    	SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
    	
    		
			Nhanvien nv =  (Nhanvien)session.selectOne("ivs.thai.myBatis.Mapper.NhanvienMapper.selectByPrimaryKey",req.getParameter("manv"));
			
			model.addAttribute("nhanvien", nv);
			
			session.close();
		return "/admin/edit";
	}
    
	@PostMapping("/edit")
	public String XulyEdit(@ModelAttribute("nhanvien") Nhanvien nhanvien, @RequestParam("file") MultipartFile file,
			HttpServletRequest req) throws IOException {
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
		session.update("ivs.thai.myBatis.Mapper.NhanvienMapper.updateByPrimaryKeySelective", nhanvien);
		session.commit();
		session.close();
		return "redirect:/admin/home";
	}
}
