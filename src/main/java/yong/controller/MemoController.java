package yong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import yong.memo.model.MemoDAO;
import yong.memo.model.MemoDTO;

@Controller
@RequestMapping("/memoWrite.do")
public class MemoController {
	
	@Autowired
	private MemoDAO memoDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView memoForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("memo/memoWriteForm");
		return mav;
	}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView memoSubmit(@ModelAttribute("cmd")MemoDTO dto) {
		int result=memoDao.memoWrite(dto);
		System.out.println(result>0?"DB입력성공!":"DB입력실패!");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("memo/memoOk");
		System.out.println(dto.toString());
		return mav;
	}
	
	
}
