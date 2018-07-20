package com.wind.web_mybatis.dao;

import java.util.ArrayList;

import com.wind.web_mybatis.dto.ContentDto;

public interface IDao {
	
	public ArrayList<ContentDto> listDao();
	public void writeDao(String mWriter, String mTitle, String mContent);
	public void deleteDao(String mId);
	public ContentDto viewDao(String mId);
	public void modifyDao(String mId, String mWriter, String mTitle, String mContent);
	public ContentDto reply_viewDao(String mId);
	public void replyDao(String mId, String bName, String mTitle, String mContent, String mGroup, String mStep, String mIndent);
	public void replyShapeDao(String mGroup, String mStep);
	public void upHitDao(String mId);
}
