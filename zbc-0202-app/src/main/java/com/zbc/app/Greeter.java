package com.zbc.app;

public class Greeter {
	
	private String stringHi;
	
	public String greet(String guest){
		return String.format(stringHi, guest);
	}

	public void setStringHi(String stringHi) {
		this.stringHi = stringHi;
	}
	

}
