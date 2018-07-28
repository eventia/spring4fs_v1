package com.wind.simple.xml.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.wind.simple.xml.Hello;
import com.wind.simple.xml.Printer;

public class HelloBeanJUnitTest {
	
//	AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:config/beans.xml");
	AbstractApplicationContext context;
	
	
	
	
	@Before
	public void init() {
		context = new GenericXmlApplicationContext("classpath:config/beans.xml");
	}

	@Test
	public void test() {
		Hello hello = (Hello) context.getBean("hello");
		System.out.println(hello.sayHello());
		assertEquals("Hello Spring", hello.sayHello());
		hello.print();
	}
	
	@Test
	public void bean2() {
		System.out.println("\n#### bean2 TEST");
		Printer printer = (Printer) context.getBean("printer");
		Printer printer2= context.getBean("printer", Printer.class);
		assertSame(printer, printer2);
	}
}
