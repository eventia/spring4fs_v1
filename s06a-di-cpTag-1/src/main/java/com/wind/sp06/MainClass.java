package com.wind.sp06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		String configLocation2 = "classpath:applicationCTX2.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation2);

		Family family = ctx.getBean("family", Family.class);
		ctx.close();
		
		System.out.println(family.getFatherName());
		System.out.println(family.getMotheriName());
		System.out.println(family.getBrotherName());
	}

}
