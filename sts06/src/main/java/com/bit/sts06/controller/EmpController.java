package com.bit.sts06.controller;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.sts06.emp.model.entity.EmpVo;
import com.bit.sts06.emp.service.Empservice;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	Empservice empservice;

	@RequestMapping(value = "/",params = "page")
	public String list(HttpServletRequest req,Model model, int page) throws SQLException {
		empservice.list(model,page);
		return "emp/list";
	}
	@RequestMapping(value = "/")
	public String list(HttpServletRequest req,Model model) throws SQLException {
		empservice.list(model);
		return "emp/list";
	}
	
	@RequestMapping(value = "/add",method=RequestMethod.GET)
	public String add(Model model) {
		model.addAttribute("title", "Add");
		return "emp/form";
	}
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	public String add(@ModelAttribute EmpVo bean,HttpServletRequest req) throws SQLException, UnsupportedEncodingException {
		
		empservice.insert(bean);
		return "redirect:./";
	}
}




