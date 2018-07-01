package com.wind.sp05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("SpringExample-05b");
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		System.out.println("ctx = " + ctx);

		Pencil pencil = ctx.getBean("pencil", Pencil.class);
		System.out.println("pencil = " + pencil);

		pencil.use();
		
		ctx.close();
		
	}

}
