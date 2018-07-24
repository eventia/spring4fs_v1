package com.wind.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.wind.web.dto.TicketDto;

public class TicketDao {

	JdbcTemplate template;
	
	PlatformTransactionManager transactionManager;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void setTransactionManager( PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}
	
	public TicketDao() {
		System.out.println(template);
	}
	
	public void cardProcess(final TicketDto dto) {
		String query = "insert into card (consumerId, amount) values (?, ?)";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, dto.getConsumerId());
				ps.setString(2, dto.getAmount());
			}
		});
	}

	public void ticketProcess(final TicketDto dto) {
		String query = "insert into ticket (consumerId, countnum) values (?, ?)";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, dto.getConsumerId());
				ps.setString(2, dto.getAmount());
			}
		});
	}

	
	public void buyTicket(final TicketDto dto) {
		System.out.println("buyTicket()");
		System.out.println("dto.getConsumerId() : " + dto.getConsumerId());
		System.out.println("dto.getAmount() : " + dto.getAmount());
		
		TransactionDefinition definition = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(definition);
		
		try {
			cardProcess(dto);
		
//			String query = "insert into card (consumerId, amount) values (?, ?)";
//			template.update(query, new PreparedStatementSetter() {
//				@Override
//				public void setValues(PreparedStatement ps) throws SQLException {
//					ps.setString(1, dto.getConsumerId());
//					ps.setString(2, dto.getAmount());
//				}
//			});
		
			
			ticketProcess(dto);
			
//			String query = "insert into ticket (consumerId, countnum) values (?, ?)";
//			template.update(query, new PreparedStatementSetter() {
//				@Override
//				public void setValues(PreparedStatement ps) throws SQLException {
//					ps.setString(1, dto.getConsumerId());
//					ps.setString(2, dto.getAmount());
//				}
//			});
			
		
			transactionManager.commit(status);
			
		} catch (Exception e) {
			e.printStackTrace();
			
			transactionManager.rollback(status);
		}
	}

	
}
