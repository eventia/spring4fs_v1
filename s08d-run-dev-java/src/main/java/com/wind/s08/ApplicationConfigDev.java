package com.wind.s08;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class ApplicationConfigDev {
	
	@Bean
	public ServerInfo serverInfo() {
		ServerInfo info = new ServerInfo();
		info.setIpNum("211.25.45.129");
		info.setPortNum("80");
		return info;
	}
}
