package com.zbc.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zbc.app.config.ConfigPart1;
import com.zbc.app.config.ConfigPart2;
import com.zbc.app.spring.MemberInfoPrinter;
import com.zbc.app.spring.MemberRegisterService;
import com.zbc.app.spring.RegisterRequest;

public class MainTwoConfs {

	public static void main(String[] args) {
		ApplicationContext ctx =
				new AnnotationConfigApplicationContext(
						ConfigPart1.class, ConfigPart2.class);
		MemberRegisterService regSvc =
				ctx.getBean("memberRegSvc", MemberRegisterService.class);
		MemberInfoPrinter infoPrinter =
				ctx.getBean("infoPrinter", MemberInfoPrinter.class);

		RegisterRequest regReq = new RegisterRequest();
		regReq.setEmail("madvirus@madvirus.net");
		regReq.setName("최범균");
		regReq.setPassword("1234");
		regReq.setConfirmPassword("1234");
		regSvc.regist(regReq);

		infoPrinter.printMemberInfo("madvirus@madvirus.net");
	}
}
