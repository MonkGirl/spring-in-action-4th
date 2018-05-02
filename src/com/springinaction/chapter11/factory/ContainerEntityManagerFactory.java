package com.springinaction.chapter11.factory;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class ContainerEntityManagerFactory {

	private static String[] entities = new String[] {"com.springinaction.chapter11.entity"};
	private static String dialect = "org.hibernate.dialect.Oracle12cDialect";
	
	/**
	 * 使用容器管理类型的JPA
	 * @param dataSource
	 * @param jpaVendorAdapter
	 * @return
	 */
	@Bean("entityManagerFactory")
	@Autowired
	public LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter){ 
		LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
		lcemfb.setDataSource(dataSource);
		lcemfb.setJpaVendorAdapter(jpaVendorAdapter);
		lcemfb.setPackagesToScan(entities);
		return lcemfb;
	}
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setDatabase(Database.ORACLE);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(false);
		adapter.setDatabasePlatform(dialect);
		return adapter;
	}
}
