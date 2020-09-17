package com.bit.sts05.dept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit.sts05.service.DeptSerive;

@Controller
public class DeptController {
		DeptSerive deptSerive;
	
		@RequestMapping("/dept/")
		public String list() {
			deptSerive.
			return "list";
			
		}
}
