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
	public ContentDto viewDao(String strID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDao(String bId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeDao(String mWriter, String mTitle, String mContent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyDao(String mId, String mWriter, String mTitle, String mContent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ContentDto reply_viewDao(String mId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void replyDao(String mId, String bName, String mTitle, String mContent, String mGroup, String mStep,
			String mIndent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void replyShapeDao(String mGroup, String mStep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upHitDao(String mId) {
		// TODO Auto-generated method stub
		
	}

	

}
