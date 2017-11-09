package yong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello.do")
	public ModelAndView hello() {
		String msg="메이븐기반의 스프링 프로젝트!";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg",msg);
		mav.setViewName("hello");
		return mav;
	}
}
