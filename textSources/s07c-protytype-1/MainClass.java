package com.wind.sp07;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml");
		
		Student student1 = ctx.getBean("student", Student.class);
		Student student2 = ctx.getBean("student", Student.class);
		student2.setName("햅번");
		
		System.out.println("student1 name : " + student1.getName());
		System.out.println("student2 name : " + student2.getName());
		if(student1==student2) {
			System.out.println("student1==student2 in singleton");
		} else {
			System.out.println("student1!=student2 in singleton");			
		}

		System.out.println("------ PAUSE ------ ");
		
		Student act1 = ctx.getBean("act", Student.class);
		Student act2 = ctx.getBean("act", Student.class);
		act2.setName("앤 헤서웨어");
		
		System.out.println("act1 name : " + student1.getName());
		System.out.println("act2 name : " + student2.getName());
		if(act1==act2) {
			System.out.println("act1==act2 in singleton");
		} else {
			System.out.println("act1!=act2 in singleton");			
		}		
		
		ctx.close();
		
	}

}
