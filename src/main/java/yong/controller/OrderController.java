package yong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import yong.order.model.orderDTO;

@Controller
public class OrderController {
	@RequestMapping("/orderForm.do")
	public ModelAndView orderForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("order/orderForm");
		return mav;
	}
	@RequestMapping("/order.do")
	public ModelAndView orderSubmit(orderDTO dto) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("order/orderList");
		return mav;
	}
}
