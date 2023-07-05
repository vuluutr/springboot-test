package com.okayjava.html.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.okayjava.html.service.ManagementTOPDto;
import com.okayjava.html.service.ManagementTOPService;

@Controller
public class ManagementTOPControllerImpl implements ManagementTOPController{
	@Autowired
	private ManagementTOPService managementTOPService;
	
	@GetMapping("/init1")
	public ModelAndView getInit() {
//		ModelAndView mav = new ModelAndView(VIEW_INIT);
		ModelAndView mav = new ModelAndView("welcome");
		ManagementTOPDto managementTOP =  managementTOPService.getInit();
		mav.addObject("mngTOP", managementTOP);
//		mav.addObject("role", 1);
		return mav;
		
	}
	
//	@GetMapping("/init2")
//	public ModelAndView getInit2() {
////		ModelAndView mav = new ModelAndView(VIEW_INIT);
//		ModelAndView mav = new ModelAndView("welcome");
//		mav.addObject("role", 2);
//		return mav;
//		
//	}
//	
//	@GetMapping("/init3")
//	public ModelAndView getInit3() {
////		ModelAndView mav = new ModelAndView(VIEW_INIT);
//		ModelAndView mav = new ModelAndView("welcome");
//		mav.addObject("role", 3);
//		return mav;
//		
//	}
}
