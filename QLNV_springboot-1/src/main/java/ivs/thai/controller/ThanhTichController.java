package ivs.thai.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ivs.thai.Util.MyBatisUtil;
import ivs.thai.model.Nhanvien;
import ivs.thai.model.ThanhtichKiluat;

@Controller
public class ThanhTichController {

	SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
	@Autowired
	private JavaMailSender emailSender;

	@GetMapping("/thanhtich")
	public String thanhtich(Model model, HttpServletRequest req) {

		List<Map<String, Object>> result = session
				.selectList("ivs.thai.myBatis.Mapper.ThanhtichKiluatMapper.getThanhTichNV", req.getParameter("manv"));
		if (!result.isEmpty()) {
			model.addAttribute("result", result);

		}

		return "admin/thanhtich";
	}

	@GetMapping("/themthanhtich")
	public String them_thanhtich(Model model, HttpServletRequest req) {
		System.out.println(req.getParameter("manv"));
		ThanhtichKiluat tt = new ThanhtichKiluat();
		tt.setManv(req.getParameter("manv"));
		model.addAttribute("thanhtich", tt);
		return "admin/themthanhtich";
	}

	@PostMapping("/themthanhtich")
	public String xuly_them_thanhtich(@ModelAttribute("thanhtich") ThanhtichKiluat thanhtich) {

		int rowEffect = session.insert("ivs.thai.myBatis.Mapper.ThanhtichKiluatMapper.insert", thanhtich);

		if (rowEffect == 1) {
			SimpleMailMessage message = new SimpleMailMessage();
			Nhanvien nv = session.selectOne("ivs.thai.myBatis.Mapper.NhanvienMapper.selectByPrimaryKey",
					thanhtich.getManv());
			String email = nv.getEmail();
			message.setTo(email);
			if (thanhtich.getLoai() == true) {
				message.setSubject("Thưởng");

				message.setText("Bạn đã nhận điểm thưởng");
			} else {
				message.setSubject("Phạt");

				message.setText("Bạn đã bị trừ điểm kỉ luật");
			}

			this.emailSender.send(message);
		}
		session.commit();
		return "redirect:/thanhtich?manv=" + thanhtich.getManv();
	}
}
