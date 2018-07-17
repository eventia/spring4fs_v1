package com.wind.web;

import static org.junit.Assert.fail;

import java.util.ArrayList;


import org.junit.Test;
import org.springframework.ui.Model;

import com.wind.web.dao.BDao;
import com.wind.web.dto.BDto;

public class Test01 {
	
	@Test
	public void test(Model model) {
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);
				
		System.out.println("TEST1");
		System.out.println("dtos : " + dtos);
		fail("Not yet implemented");
	}

}
