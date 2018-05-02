package com.springinaction.chapter11.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import com.springinaction.chapter11.entity.Spitter;
import com.springinaction.chapter7.exceptions.DuplicateSpittleException;
import com.springinaction.chapter9.repository.SpitterRepository;

@Repository
public class JndiObjectRepositoryImpl implements SpitterRepository{

	@Autowired
	private JdbcOperations jdbcTemplate;

	@Override
	public Spitter save(Spitter spitter) throws DuplicateSpittleException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Spitter findByUsername(String username) {
		List<Spitter> list = jdbcTemplate.query("select * from spitter where username='"+username+"'", this::mapSpitter);
		return list.size()>0?list.get(0):null;
	}

	@Override
	public List<Spitter> findAll() {
		return jdbcTemplate.query("select * from spitter", this::mapSpitter);
	}
	
	private Spitter mapSpitter(ResultSet rs, int row) throws SQLException{
		return new Spitter(
				rs.getLong("id"),
				rs.getString("username"),
				rs.getString("password"),
				rs.getString("firstname"),
				rs.getString("lastname"),
				rs.getString("email"));
	}
}
