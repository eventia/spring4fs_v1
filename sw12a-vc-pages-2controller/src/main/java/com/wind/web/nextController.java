package com.wind.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/next")
public class nextController {

	@RequestMapping("/pageone")
	public String next1(Model model) {
		model.addAttribute("id", 911);
		return "next/pageone";
	}
	
	@RequestMapping("/pagetwo")
	public String next2(Model model) {
		model.addAttribute("id", 912);
		return "next/pagetwo";
	}

	@RequestMapping("/pagethree")
	public String next3(Model model) {
		model.addAttribute("id", 913);
		return "next/pagethree";
	}

}
