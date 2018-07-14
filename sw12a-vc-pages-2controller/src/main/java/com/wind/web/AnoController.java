package com.wind.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnoController {
	
	@RequestMapping("/content/contentView")
	public String contentView(Model model) {
		model.addAttribute("id", "123abc");
		
		return "/content/contentView";
	}
}
