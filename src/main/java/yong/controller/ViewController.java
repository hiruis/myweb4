package yong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

	@RequestMapping("/viewTest1.do")
	public ModelAndView viewTest1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("view/viewOk");//뷰의 이름을 직접 명시했기때문에 명시적 뷰 지정방식이된다.
		return mav;
		
	}
	@RequestMapping("/viewTest2.do")
	public String viewTest2() {
		return "view/viewOk"; //ModelAndView를 생성하지않고 바로 이동할 페이지를 리턴 시킬수있다.
		
	}
	@RequestMapping("/view/viewOk.do")
	public void viewTest3() {
		
	}
	@RequestMapping("/viewTest4.do")
	public ModelAndView viewTest4() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/hello.do");
		return mav;
	}
}
