package yong.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import yong.join.model.MemberDAO;
import yong.test.MapsDAO;
import yong.test.MapsDTO;

@Controller
public class HelloController {
	
	@Autowired
	private MapsDAO mapsDao;
	
	@RequestMapping(value="/hello.do")
	public ModelAndView hello() {
		String msg="메이븐기반의 스프링 프로젝트!";
		
		ArrayList<MapsDTO> arr = mapsDao.mapcode();
		ModelAndView mav = new ModelAndView();
		mav.addObject("mapslist",arr);
		mav.setViewName("hello");
		return mav;
	}
}
