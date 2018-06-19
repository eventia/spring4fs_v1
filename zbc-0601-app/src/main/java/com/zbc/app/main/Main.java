package com.zbc.app.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.zbc.app.spring.Client;

public class Main {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:springconf.xml");
		Client client = ctx.getBean("client", Client.class);
		client.send();
		ctx.close();
	}
}
