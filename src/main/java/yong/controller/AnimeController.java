package yong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnimeController {

	@ModelAttribute("keyword") //다음페이지에 keyword라는 이름으로 전달
	public String[] getKeyword() {
		String keyword[] = { "아기공룡둘리", "원피스", "나루토", "블리치", "세일러문", "천사소녀네티" };
		return keyword;
	}
	@ModelAttribute("cate")
	public String[] getCategory() {
		String category[] = { "한국", "일본", "미국" };
		
		return category;
	}
	@RequestMapping("/animeFindA.do")
	public ModelAndView animeFindA() {


		ModelAndView mav = new ModelAndView();
		mav.setViewName("anime/animeFindA");
		return mav;
	}

	@RequestMapping("/animeFindB.do")
	public String animeFindB(Model model) {


		return "anime/animeFindB";
	}
}
