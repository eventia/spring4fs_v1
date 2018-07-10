package com.wind.sp06;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Configuration
@Component
public class ApplicationConfig {
	@Bean
	public Student student1() {	
		
		Student student = new Student("오드리햅번", 25);
		return student;
	}
	@Bean
	public Student student2() {

		Student student = new Student("그레고리 펙", 28);
		return student;	
	}
}
