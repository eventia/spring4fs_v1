package com.wind.web.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.wind.web.dto.TicketDto;

public class TicketDao {

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public TicketDao() {
		System.out.println(template);
	}
	
	public void buyTicket(final TicketDto dto) {
		System.out.println("buyTicket()");
		System.out.println("dto.getConsumerId() : " + dto.getConsumerId());
		System.out.println("dto.getAmount() : " + dto.getAmount());
		
		
		
		String query = "insert into card (consumerId, amount) values (?, ?)";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, dto.getConsumerId());
				ps.setString(2, dto.getAmount());
			}
		});

//		template.update(new PreparedStatementCreator() {
//			
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con)
//					throws SQLException {
//				String query = "insert into card (consumerId, amount) values (?, ?)";
//				PreparedStatement pstmt = con.prepareStatement(query);
//				pstmt.setString(1, dto.getConsumerId());
//				pstmt.setString(2, dto.getAmount());
//				
//				return pstmt;
//			}
//		});
		
		query = "insert into ticket (consumerId, countnum) values (?, ?)";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, dto.getConsumerId());
				ps.setString(2, dto.getAmount());
			}
		});

//		template.update(new PreparedStatementCreator() {
//			
//			@Override
//			public PreparedStatement createPreparedStatement(Connection con)
//					throws SQLException {
//				String query = "insert into ticket (consumerId, countnum) values (?, ?)";
//				PreparedStatement pstmt = con.prepareStatement(query);
//				pstmt.setString(1, dto.getConsumerId());
//				pstmt.setString(2, dto.getAmount());
//				
//				return pstmt;
//			}
//		});
	}

	
}
