package com.zbc.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.zbc.app.spring.MemberDao;
import com.zbc.app.spring.MemberRegisterService;

@Configuration
@Import(ConfigPartSub.class)
public class ConfigPartMain {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}

}
