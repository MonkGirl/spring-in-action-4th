/**
 * 
 */
package com.springinaction.chapter1.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.springinaction.chapter1.entity.Employee;

/**
 * @author MonkGirl
 *
 */
public class OldJdbcTemplate {

	public Employee getEmployeeById(long id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			//conn = dataSource.
		//}catch(SQLException e){
			
		}finally {
			
		}
		return null;
	}
}
