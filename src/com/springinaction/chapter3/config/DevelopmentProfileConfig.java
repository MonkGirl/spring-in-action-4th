/**
 * 
 */
package com.springinaction.chapter3.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 * @author MonkGirl
 *
 */
@Configuration
@Profile("dev")
public class DevelopmentProfileConfig {

	@Bean(destroyMethod="shutdown")
	public DataSource dataSource() {
		return (DataSource) new EmbeddedDatabaseBuilder()
				.setType(EmbeddedDatabaseType.H2)
				.addScript("calasspath:schema.sql")
				.addScript("classpath:test-data.sql")
				.build();
	}
}
