package com.zbc.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zbc.app.spring.MemberDao;
import com.zbc.app.spring.MemberInfoPrinter;
import com.zbc.app.spring.MemberPrinter;
import com.zbc.app.spring.MemberRegisterService;

@Configuration
public class JavaConfig {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}

	@Bean
	public MemberPrinter printer() {
		return new MemberPrinter();
	}

	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao());
		infoPrinter.setPrinter(printer());
		return infoPrinter;
	}
}
