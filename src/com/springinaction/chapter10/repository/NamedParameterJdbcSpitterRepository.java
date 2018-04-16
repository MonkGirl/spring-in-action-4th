package com.springinaction.chapter10.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.springinaction.chapter5.spittr.entity.Spitter;

public class NamedParameterJdbcSpitterRepository implements SpitterRepository{

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public void addSpitter(Spitter spitter) {
		String addSql = "insert into spitter(id, username, password, firstname, lastname, email)"
				+ " values(:id, :username, :password, :firstname, :lastname, :email)";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", spitter.getId());
		paramMap.put("username", spitter.getUsername());
		paramMap.put("password", spitter.getPassword());
		paramMap.put("firstname", spitter.getFirstName());
		paramMap.put("lastname", spitter.getLastName());
		paramMap.put("email", spitter.getEmail());
		jdbcTemplate.update(addSql, paramMap);
		
	}

	@Override
	public Spitter findOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
