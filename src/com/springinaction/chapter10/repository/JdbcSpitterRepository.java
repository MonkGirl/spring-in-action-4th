package com.springinaction.chapter10.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ActiveProfiles;

import com.springinaction.chapter5.spittr.entity.Spitter;

@Repository
public class JdbcSpitterRepository implements SpitterRepository{
	
	@Autowired
	private JdbcOperations jdbcTemplate;
	
//	@Autowired
//	public JdbcSpitterRepository(JdbcOperations jdbcOperations) {
//		this.jdbcOperations = jdbcOperations;
//	}

	@Override
	public void addSpitter(Spitter spitter) {
		String addSql = "insert into spitter values(?,?,?,?,?,?)";
		jdbcTemplate.update(addSql, new Object[] {spitter.getId(), spitter.getUsername(),spitter.getPassword()
				,spitter.getFirstName(), spitter.getLastName(), spitter.getEmail()});
	}
	
//	@Override
//	public Spitter findOne(long id) {
//		String findOne = "select * from spitter where id=?";
//		return jdbcTemlate.queryForObject(findOne, new SpitterRowMapper(),id);
//	}
	
	/**
	 * Lambda表达式实现
	 */
//	@Override
//	public Spitter findOne(long id) {
//		String findOne = "select * from spitter where id=?";
//		//return jdbcOperations.queryForObject(findOne, new SpitterRowMapper(),id);
//		return jdbcTemlate.queryForObject(findOne, 
//				(rs, rowNum) -> {
//					return new Spitter(
//							rs.getLong("id"),
//							rs.getString("username"),
//							rs.getString("password"),
//							rs.getString("firstname"),
//							rs.getString("lastname"),
//							rs.getString("email"));
//				}, id);
//	}
	
	/**
	 * 方法引用实现
	 */
	@Override
	public Spitter findOne(long id) {
		String findOne = "select * from spitter where id=?";
		return jdbcTemplate.queryForObject(findOne, this::mapSpitter, id);
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

