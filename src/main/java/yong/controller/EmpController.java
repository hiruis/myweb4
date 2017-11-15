package yong.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import yong.emp.model.EmpDAO;
import yong.emp.model.EmpDTO;

@Controller
public class EmpController {
	
	@Autowired
	private EmpDAO empDao;
	
//	@RequestMapping("/emp.do")
//	public String empMain() {
//		
//		return "emp/emp";
//	}
	@RequestMapping("/empAdd.do")
	public ModelAndView empAdd(EmpDTO dto) {
		int result = empDao.empAdd(dto);
		String msg=result>0?"사원등록완료!":"사원등록실패!";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg",msg);
		mav.addObject("gopage","emp.do");
		mav.setViewName("emp/empMsg");
		return mav;
		
	}
	
	@RequestMapping("/emp.do")
	public ModelAndView empList() {
		List<EmpDTO> arr = empDao.empList();
		ModelAndView mav = new ModelAndView();
		mav.addObject("emplist",arr);
		mav.setViewName("emp/emp");
		return mav;
	}
	@RequestMapping("/empDel.do")
	public ModelAndView empDel(EmpDTO dto) {
		int result = empDao.empDel(dto);
		String msg=result>0?"사원삭제완료!":"사원삭제실패!";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg",msg);
		mav.addObject("gopage","emp.do");
		mav.setViewName("emp/empMsg");
		return mav;
		
	}
	@RequestMapping("/empSearch.do")
	public ModelAndView empSearch(EmpDTO dto) {
		List<EmpDTO> arr = empDao.empSearch(dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("empsearchlist",arr);
		mav.setViewName("emp/empSearch");
		return mav;
	}
	@RequestMapping("/empUpdateList.do")
	public ModelAndView empUpdateList(EmpDTO dto) {
		EmpDTO dtos = empDao.empUpdateList(dto);
		ModelAndView mav = new ModelAndView();
		mav.addObject("emplist",dtos);
		mav.setViewName("emp/empUpdateList");
		return mav;
	}
	@RequestMapping("/empUpdate.do")
	public ModelAndView empUpdate(EmpDTO dto) {
		int result = empDao.empUpdate(dto);
		String msg=result>0?"사원수정완료!":"사원수정실패!";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg",msg);
		mav.addObject("gopage","emp.do");
		mav.setViewName("emp/empMsg");
		return mav;
	}

}
