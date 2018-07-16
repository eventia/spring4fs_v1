package com.wind.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequesControllerOne {
	
	@RequestMapping("/index")
	public String goIndex() {
		return "index";
	}

	@RequestMapping("/student")
	public String goStudent(HttpServletRequest httpServletRequest, Model model) {
		
		String id = httpServletRequest.getParameter("id");
		model.addAttribute("studentId", id);
		
		return "student";
	}
	
}
