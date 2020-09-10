package com.bit.sts01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ex03Controller {

		@RequestMapping("/ex03")
		public ModelAndView ex03() {
			return new ModelAndView("home");
			
			
		}	
}
