package com.bit.sts04.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sts04Controller {

	@RequestMapping("/")
	public String index(Model model,HttpServletRequest req) throws SQLException {
		String[] arr= {
				"1.jpg",
				"2.jpg",
				"3.jpg",
				"4.jpg"
			
				
				
		};
		//model.addAttribute("imgs", arr);
		req.setAttribute("imgs", arr);
		return "home";
	}
}