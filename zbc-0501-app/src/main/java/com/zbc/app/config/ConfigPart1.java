package com.zbc.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zbc.app.spring.MemberDao;
import com.zbc.app.spring.MemberRegisterService;

@Configuration
public class ConfigPart1 {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}

}
