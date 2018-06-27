package com.wind.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wind.web.service.BListService;
import com.wind.web.service.BService;

@Controller
public class BController {
	
	BService service = null;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		service = new BListService();
		service.execute(model);
		
		return "list";
	}
	

}
