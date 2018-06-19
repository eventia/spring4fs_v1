package com.zbc.app;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		//System.out.println("ctx = " + ctx);

		Greeter tmp1 = ctx.getBean("greeter", Greeter.class);
		Greeter tmp2 = ctx.getBean("greeter", Greeter.class);
		System.out.println("\ntmp1 = " + tmp1);
		System.out.println("tmp2 = " + tmp2);

		System.out.println("(tmp1 == tmp2) = " + (tmp1 == tmp2));
		ctx.close();
	}

}
