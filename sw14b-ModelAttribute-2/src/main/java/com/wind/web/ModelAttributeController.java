package com.wind.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wind.web.StudentInformation;

@Controller
public class ModelAttributeController {
	
	@RequestMapping("/student_view")
	public String studentView(@ModelAttribute("studentInfo") StudentInformation studentInformation){
		return "student_view";
	}


}
