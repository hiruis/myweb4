package test.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import yong.test.MapsDAO;
import yong.test.MapsDTO;

@Controller
public class MapsController {
	
	@Autowired
	private MapsDAO mapsDao;
	
	@RequestMapping(value="/maps.do")
	public ModelAndView maps() {
		ModelAndView mav = new ModelAndView();
		ArrayList<MapsDTO> arr = mapsDao.mapcode();
		mav.addObject("mapslist",arr);
		mav.setViewName("test/mymaps");
		return mav;
	}
	@RequestMapping("/storeAddForm.do")
	public String storeAddForm() {
		return "test/storeAdd";
	}
	
	@RequestMapping("/storeAdd.do")
	public String storeAdd(MapsDTO dto) {
		
		int cnt =mapsDao.storeAdd(dto);
		if(cnt>0) {
			System.out.println("성공");
		}
		return "index";
	}
}
