package com.madhu.springMVC8.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SomeController {
	
	@RequestMapping("/myWeb")
	public ModelAndView myfun() {
		ModelAndView mv = new ModelAndView("myWeb");
		return mv;
	}
	
}
