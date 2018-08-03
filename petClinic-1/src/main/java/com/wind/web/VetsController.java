package com.wind.web;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wind.web.dao.IDao;
import com.wind.web.dto.VetspecialtiesDto;

@Controller
public class VetsController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/vetslist")
	public String vetslist(Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("vetslist", dao.vetslistDao());
		return "vetslist";
	}
	
	@RequestMapping("/vetselect_view")
	public String vetselect_view(HttpServletRequest request, Model model) { 
		return "vetselect_view"; 
	}
	
	@RequestMapping("/vetselect")
	public String vetselect(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("vetselect", dao.vetselectDao(Integer.parseInt(request.getParameter("specialty_id"))));
		
		ArrayList<VetspecialtiesDto> dto;
		dto = dao.vetselectDao(Integer.parseInt(request.getParameter("specialty_id")));

		ArrayList dto2 = new ArrayList<Integer>();
//		ArrayList<integer> dto2;
		for(int i=0;i<dto.size();i++) {
//			model.addAttribute("vetselect2", dao.vetselect2Dao(dto.get(i).getVet_id()));
			dto2.add(dao.vetselect2Dao(dto.get(i).getVet_id()));
			
			System.out.println(dto.get(i).getVet_id());
			System.out.println("vets_id = "+dao.vetselect2Dao(dto.get(i).getVet_id()));
		}
		model.addAttribute("vetselect2", dto2);
		
		System.out.println("size = " + dto.get(0).getVet_id());		
		System.out.println("size = " + dto.get(1).getVet_id());		
		System.out.println(dto.getClass());
		System.out.println(dto.size());
		
//		model.addAttribute("vetselect", dto);
		return "vetselect";
	}
	
	
	
	
}
