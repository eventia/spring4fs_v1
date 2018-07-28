package com.wind.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wind.web.service.BListService;
import com.wind.web.service.BService;
import com.wind.web.util.Constant;

@Controller
public class BController {
	
	BService service = null;
	
	public JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}	
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		service = new BListService();
		service.execute(model);
		
		return "list";
	}

}
