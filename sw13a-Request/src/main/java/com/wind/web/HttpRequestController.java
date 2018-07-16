package com.wind.web;

import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.synth.SynthSplitPaneUI;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wind.web.member.Member;

@Controller
public class HttpRequestController {
	
	// Step 1 - HttpServletRequest
	@RequestMapping("/board/confirm_id")
	public String confirmId(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		
		return "board/confirm_id";
	}
	
	// Step 2 - @RequestParam()
	@RequestMapping("/board/check_id")
	public String checkid(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "board/check_id";
	}
	
	// Step 3 - 객체(Member)를 Model 에 담아 전달
	@RequestMapping("/member/join")
	public String joinData(
		@RequestParam("name") String name, 
		@RequestParam("id") String id, 
		@RequestParam("pw") String pw, 
		@RequestParam("email") String email, 
		Model model) {
		
		Member member = new Member();
		member.setName(name);
		member.setId(id);
		member.setPw(pw);
		member.setEmail(email);
		
		model.addAttribute("member", member); 
		return "member/join";
	}
	
	//Step 4 - 3번을 간소화, 커맨드 객체를 직접 전달
	@RequestMapping("/member/joinsimple")
	public String joinDataSimple(Member member) {
		return "member/join";
	}
}
