package test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MapsController {
	
	@RequestMapping(value="/maps.do")
	public ModelAndView maps() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("navermaps");
		return mav;
	}
}
