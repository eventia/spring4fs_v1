package com.wind.s08;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {
	
	private Environment env;
	private String adminId;
	private String adminPw;
	
	
	

	public Environment getEnv() { return env; }
	public String getAdminId() { return adminId; }
	public String getAdminPw() { return adminPw; }

	public void setEnv(Environment env) { this.env = env; }
	public void setAdminId(String adminId) { this.adminId = adminId; }
	public void setAdminPw(String adminPw) { this.adminPw = adminPw; }

	@Override
	public void destroy() throws Exception {
		System.out.println("destory()");
	}
	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		setAdminId(env.getProperty("admmin.id"));
		setAdminPw(env.getProperty("admmin.pw"));
	}

	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("setEnvironment()");
		setEnv(environment);

	}
	
	

}
