package com.zbc.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zbc.app.spring.MemberDao;
import com.zbc.app.spring.MemberInfoPrinter;
import com.zbc.app.spring.MemberPrinter;

@Configuration
public class ConfigPartSub {

	@Autowired
	private MemberDao memberDao;

	@Bean
	public MemberPrinter printer() {
		return new MemberPrinter();
	}

	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao);
		infoPrinter.setPrinter(printer());
		return infoPrinter;
	}

}
