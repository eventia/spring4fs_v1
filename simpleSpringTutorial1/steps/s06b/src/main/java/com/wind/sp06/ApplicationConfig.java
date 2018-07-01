package com.wind.sp06;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("수영");
		hobbies.add("요리");
		
		Student student = new Student("홍길동", 20, hobbies);
		student.setHeight(180);
		student.setWeight(80);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("독서"); 
		hobbies.add("보드"); 
		
		Student student = new Student("코난",  18, hobbies);
		student.setHeight(150);
		student.setWeight(45);
		
		return student;
	}

}
