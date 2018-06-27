package com.wind.mydb;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MySQLConnectionTest {
	
	@Inject
	private DataSource ds;
	private ApplicationContext ctxt;
	
	@Test
	public void testConnection() throws Exception {
		
		System.out.println("\nctxt = "+ctxt);
		try (Connection con = ds.getConnection()) {
			
			System.out.println("\n >>>>>>>>>> Connection 출력 : " + con + "\n");
			
		}catch (Exception e) {
			System.out.println("\nerror\n");
			e.printStackTrace();
			System.out.println("\nerror\n");
		}
	}
}
