package yong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;

@Controller
public class ModelController {

	@RequestMapping("/modelTest1.do")
	public String modelTest1(Map model) {//Map객체의 경우 다음 페이지까지 자동으로 이동된다. 도메인오브젝트, 맵, 모델, 모델밸류 <<4가지방법
		
		model.put("result", "Map객체를 이용한 데이터 전달");
		return "model/modelOk";
	}
	@RequestMapping("/modelTest2.do")
	public String modelTest2(Model model) {
		model.addAttribute("result","Model객체를 이용한 데이터전달");
		return "model/modelOk";	
	}
	@RequestMapping("/modelTest3.do")
	public String modelTest3(ModelMap model) {
		model.addAttribute("result", "ModelMap객체를 이용한 데이터 전달");
		
		return "model/modelOk";
	}
/*	@RequestMapping("/model/modelOk.do")
	public Map modelTest4() {
		Map model=new HashMap();
		model.put("result", "Map을 반환타입으로 전달한 데이터");
		return model;
	}*/
	@RequestMapping("/model/modelOk.do")
	public Model modelTest5() {
		
		Model model = new ExtendedModelMap();
		model.addAttribute("result","Model을 반환타입으로 전달한 데이터");

		return model;
	}	
}
