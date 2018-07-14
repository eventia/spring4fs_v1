package com.wind.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableController {
	
	@RequestMapping("/member/{memberId}")
	public String getMemberId(@PathVariable String memberId, Model model) {
		model.addAttribute("memberId", memberId);
		return "member/memberView";
	}

}
