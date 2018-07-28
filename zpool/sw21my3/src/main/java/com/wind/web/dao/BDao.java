package com.wind.web.dao;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.wind.web.dto.BDto;
import com.wind.web.util.Constant;

public class BDao {

	JdbcTemplate template = null;
	
	public BDao() {
		this.template = Constant.template;
	}

	public ArrayList<BDto> list() {
		String query = "select bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent from mvc_board order by bGroup desc, bStep asc";
		return (ArrayList<BDto>) template.query(query, new BeanPropertyRowMapper<BDto>(BDto.class));
	}
}
