package com.wind.web_mybatis.dto;

import java.sql.Timestamp;

public class ContentDto {

	private int mId;
	private String mWriter;
	private String mTitle;
	private String mContent;
	Timestamp mDate;
	int mHit;
	int mGroup;
	int mStep;
	int mIndent;

	public ContentDto() {	}

	public ContentDto(int mId, String mWriter, String mContent, String mTitle, Timestamp mDate, int mHit, int mGroup, int mStep, int mIndent) {
		this.mId = mId;
		this.mWriter = mWriter;
		this.mContent = mContent;
		this.mTitle = mTitle;
		this.mDate = mDate;
		this.mHit = mHit;
		this.mGroup = mGroup;
		this.mStep = mStep;
		this.mIndent = mIndent;
	}

	public int getmId() {
		return mId;
	}

	public String getmWriter() {
		return mWriter;
	}

	public String getmContent() {
		return mContent;
	}

	public String getmTitle() {
		return mTitle;
	}

	public Timestamp getmDate() {
		return mDate;
	}

	public int getmHit() {
		return mHit;
	}

	public int getmGroup() {
		return mGroup;
	}

	public int getmStep() {
		return mStep;
	}

	public int getmIndent() {
		return mIndent;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public void setmWriter(String mWriter) {
		this.mWriter = mWriter;
	}

	public void setmContent(String mContent) {
		this.mContent = mContent;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public void setmDate(Timestamp mDate) {
		this.mDate = mDate;
	}

	public void setmHit(int mHit) {
		this.mHit = mHit;
	}

	public void setmGroup(int mGroup) {
		this.mGroup = mGroup;
	}

	public void setmStep(int mStep) {
		this.mStep = mStep;
	}

	public void setmIndent(int mIndent) {
		this.mIndent = mIndent;
	}
	


}
