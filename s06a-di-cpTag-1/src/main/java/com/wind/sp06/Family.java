package com.wind.sp06;

public class Family {
	
	String fatherName;
	String motheriName;
	String brotherName;
	
	public Family(String fatherName, String motheriName) {
		super();
		this.fatherName = fatherName;
		this.motheriName = motheriName;
	}

	public String getFatherName() { return fatherName; }
	public String getMotheriName() { return motheriName; }
	public String getBrotherName() { return brotherName; }
	
	public void setFatherName(String fatherName) { this.fatherName = fatherName; }
	public void setMotheriName(String motheriName) { this.motheriName = motheriName; }
	public void setBrotherName(String brotherName) { this.brotherName = brotherName; }

	}
