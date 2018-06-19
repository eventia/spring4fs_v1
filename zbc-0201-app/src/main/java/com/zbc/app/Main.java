package com.zbc.app;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		System.out.println("ctx = " + ctx);

		Greeter tmp = ctx.getBean("greeter", Greeter.class);
		System.out.println("tml = " + tmp);

		String msg = tmp.greet("바람");
		System.out.println(msg);
		ctx.close();
	}

}
