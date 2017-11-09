package yong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import yong.join.model.MemberDAO;
import yong.join.model.MemberDTO;



@Controller
public class LoginController {
	
	@Autowired
	private MemberDAO memberDao;
	
	@RequestMapping(value="login.do",method=RequestMethod.GET)
	public  ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/memberLogin");
		return mav;
		
	}
	@RequestMapping(value="login.do",method=RequestMethod.POST)
	public  ModelAndView memberLogin(MemberDTO dto) {
		int result=memberDao.memberLogin(dto);
		ModelAndView mav = new ModelAndView();
		String msg="";
		if(result==0) {
			msg = "로그인되었습니다.";
		}else if(result==1){
			msg="아이디나 비밀번호가 정보가 옳지않습니다.";
		}else if(result==2) {
			msg="등록된 회원이 아닙니다.";
		}else {
			msg="[오류]고객센터에 문의바랍니다.";
			
		}
		mav.addObject("msg",msg);
		mav.addObject("result",result);
		mav.setViewName("member/memberLoginForm");
		return mav;
		
	}
}
