package ivs.thai.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.cj.xdevapi.SelectStatement;

import ivs.thai.Util.MyBatisUtil;
import ivs.thai.model.Nhanvien;
import ivs.thai.model.ThanhtichKiluat;


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
    public String XulyEdit(@ModelAttribute("nhanvien") Nhanvien nhanvien)
    {
    	SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			session.update("ivs.thai.myBatis.Mapper.NhanvienMapper.updateByPrimaryKeySelective",nhanvien);
			session.commit();
			session.close();
    	return "redirect:/admin/home";
    }
}
