package com.wind.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping("/student_confirm")
	public String studentRedurect(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:student_ok";
		}
		return "redirect:student_ng";
	}

	@RequestMapping("/student_ok")
	public String studentOk() {
		return "student/student_ok";
	}

	@RequestMapping("/student_ng")
	public String studentNg() {
		return "student/student_ng";
	}
	
	@RequestMapping("/student_url1")
	public String studentUrl1() {
		return "student/student_url1";
	}
	

}
