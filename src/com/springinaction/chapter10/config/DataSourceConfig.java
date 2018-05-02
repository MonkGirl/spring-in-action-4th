package com.springinaction.chapter10.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
public class DataSourceConfig {
	
	private static final String oracleDriverClassName = "oracle.jdbc.driver.OracleDriver";
	private static final String oracleUrl = "jdbc:oracle:thin:@//127.0.0.1:1521/ORCL";
	private static final String oracleUsername = "c##martin";
	private static final String oraclePassword = "martin";
	
	private static final String sqlServerDriverClassName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String sqlServerUrl = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=study";
	private static final String sqlServerUsername = "sa";
	private static final String sqlServerPassword = "2930321";
	
	/**
	 * JNDI配置数据源
	 * @return
	 */
	@Profile("production")//生产环境的数据源
	@Bean
	public JndiObjectFactoryBean jndiDataSource() {
		JndiObjectFactoryBean jndiObjectFB = new JndiObjectFactoryBean();
		jndiObjectFB.setJndiName("jdbc/oracle");
		jndiObjectFB.setResourceRef(true);
		jndiObjectFB.setProxyInterface(DataSource.class);
		return jndiObjectFB;
	}
	
	/**
	 * 使用BasicDataSource配置数据源
	 * @return
	 */
	@Profile("dev")
	@Bean("dataSource")
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(oracleDriverClassName);
		ds.setUrl(oracleUrl);
		ds.setUsername(oracleUsername);
		ds.setPassword(oraclePassword);
		ds.setInitialSize(5);
		ds.setMaxTotal(10);
		return ds;
	}
	
	/**
	 * 使用DriverManagerDataSource配置数据源(唯一区别，没有连接池功能)
	 * @return
	 */
	@Profile("prod")
	@Bean("dataSource")
	public DataSource driverManagerDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(sqlServerDriverClassName);
		dataSource.setUrl(sqlServerUrl);
		dataSource.setUsername(sqlServerUsername);
		dataSource.setPassword(sqlServerPassword);
		return dataSource;
	}
	
	/**
	 * 使用嵌入式数据库
	 * @return
	 */
//	@Bean
//	public DataSource embeddedDatabaseBuilder() {
//		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
//				.addScript("classpath:schema.sql")
//				.addScript("classpath:test-data.sql")
//				.build();
//	}
//	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource datasource) {
		return new JdbcTemplate(datasource);
	}
}
