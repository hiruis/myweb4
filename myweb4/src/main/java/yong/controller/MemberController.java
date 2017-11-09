package yong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import yong.join.model.MemberDAO;
import yong.join.model.MemberDTO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberDAO memberDao;
	
	@RequestMapping(value="/memberIdchk.do",method=RequestMethod.GET)
	public ModelAndView memberIdchk() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/memberidchkForm");
		return mav;
	}
	
	@RequestMapping(value="/memberIdchk.do",method=RequestMethod.POST)
	public ModelAndView memberIdsend(MemberDTO dto) {
		int result = memberDao.memberIdchk(dto.getId());
		String msg = result>0?"중복된 아이디가 존재합니다.":"사용가능한 아이디입니다.";
		ModelAndView mav = new ModelAndView();
		mav.addObject("result",result);
		mav.addObject("msg",msg);
		mav.setViewName("member/memberidchk");
		return mav;
	}	
	@RequestMapping(value="/memberJoin.do",method=RequestMethod.GET)
	public ModelAndView memberForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/memberJoinForm");
		return mav;
	}
	@RequestMapping(value="/memberJoin.do",method=RequestMethod.POST)
	public ModelAndView memberSubmit(MemberDTO dto) {
		int result = memberDao.memberJoin(dto);
		String msg = result>0?"회원가입되었습니다.":"회원가입에 실패하셨습니다.";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg",msg);
		if(result>0) {
			mav.addObject("gage","/myweb4");
		}else {
			mav.addObject("gage","memberJoin.do");
		}
		mav.setViewName("member/memberMsg");
		return mav;
	}
}
