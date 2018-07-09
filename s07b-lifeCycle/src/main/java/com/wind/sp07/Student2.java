package com.wind.sp07;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student2 implements InitializingBean, DisposableBean{
	
	private String name;
	private int age;

	public String getName() { return name;}
	public int getAge() { return age;}

	@Override
	public void destroy() throws Exception {
		System.out.println("destory");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPorperitiesSet");
	}
}
