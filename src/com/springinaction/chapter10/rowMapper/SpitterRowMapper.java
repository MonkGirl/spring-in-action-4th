package com.springinaction.chapter10.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springinaction.chapter5.spittr.entity.Spitter;

public class SpitterRowMapper implements RowMapper<Spitter>{

	@Override
	public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Spitter(
				rs.getLong("id"),
				rs.getString("username"),
				rs.getString("password"),
				rs.getString("firstname"),
				rs.getString("lastname"),
				rs.getString("email"));
	}

}
