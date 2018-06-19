package com.zbc.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.zbc.app.aspect.ExeTimeAspect2;
import com.zbc.app.chap07.Calculator;
import com.zbc.app.chap07.RecCalculator;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {

	@Bean
	public ExeTimeAspect2 exeTimeAspect() {
		return new ExeTimeAspect2();
	}

	@Bean
	public Calculator recCal() {
		return new RecCalculator();
	}
}
