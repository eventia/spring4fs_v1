package com.wind.web;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wind.web.dao.IDao;
import com.wind.web.dto.ContentDto;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@Autowired
	private SqlSession sqlSession;
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("list", dao.listDao());
		return "/list";
	}
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) { 
		IDao dao = sqlSession.getMapper(IDao.class);
		upHit(request.getParameter("bId"));
		model.addAttribute("content_view", dao.viewDao(request.getParameter("bId")));
		return "content_view";
	}

	@RequestMapping("/write_view")
	public String writeForm() {
		return "/write_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.writeDao(request.getParameter("bName"), request.getParameter("bTitle"), request.getParameter("bContent"));
		return "redirect:list";
	}
	
	@RequestMapping("/view")
	public String view() {
		
		return "/view";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.deleteDao(request.getParameter("bId"));
		return "redirect:list";
	}
	
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.modifyDao(request.getParameter("bName"), request.getParameter("bTitle"), 
			request.getParameter("bContent"), request.getParameter("bId"));
		return "redirect:list";
	}
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		replyShape(request.getParameter("bGroup"), request.getParameter("bStep"));
		dao.replyDao(
				request.getParameter("bName"), 
				request.getParameter("bTitle"), 
				request.getParameter("bContent"), 
				Integer.parseInt(request.getParameter("bGroup")), 
				Integer.parseInt(request.getParameter("bStep"))+1, 
				Integer.parseInt(request.getParameter("bIndent"))+1);
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		IDao dao = sqlSession.getMapper(IDao.class);
		model.addAttribute("reply_view", dao.reply_viewDao(request.getParameter("bId")));		
		return "reply_view";
	}
	
	public void replyShape(String bGroup, String bStep) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.replyShape(bGroup, bStep);
	}
	
	public void upHit(String bId) {
		IDao dao = sqlSession.getMapper(IDao.class);
		dao.upHit(bId);
	}
	
}
