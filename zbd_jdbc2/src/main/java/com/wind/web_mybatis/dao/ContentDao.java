package com.wind.web_mybatis.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.wind.web_mybatis.dto.ContentDto;

public class ContentDao implements IDao{

	JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public ContentDao() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public ArrayList<ContentDto> listDao() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void writeDao(String mWriter, String mContent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ContentDto viewDao(String strID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDao(String bId) {
		// TODO Auto-generated method stub
		
	}

	

}
