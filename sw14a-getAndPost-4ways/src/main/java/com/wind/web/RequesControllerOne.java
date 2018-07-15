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
	// 0. GET or POST
	// 1. no write GET & POST
	// 2. { GET * POST } both written

	@RequestMapping(value="/student", method=RequestMethod.GET)
// 	@RequestMapping("/student")
//	@RequestMapping(value="/student", method= {RequestMethod.GET, RequestMethod.POST})
	public String goStudent(HttpServletRequest httpServletRequest, Model model) {
		
		String id = httpServletRequest.getParameter("id");
		model.addAttribute("studentId", id);
		
		return "student";
	}
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public ModelAndView goStudent(HttpServletRequest httpServletRequest) {
		
		String id = httpServletRequest.getParameter("id");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("student");
		mv.addObject("studentId", id);
		return mv;
	}
}
