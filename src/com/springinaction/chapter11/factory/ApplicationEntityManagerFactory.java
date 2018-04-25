package com.springinaction.chapter11.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class ApplicationEntityManagerFactory {

	/**
	 * 配置应用程序管理类型的JPA，persistence.xml中需要配置数据源
	 * @return
	 */
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactoryBean() {
		LocalEntityManagerFactoryBean lemfb = new LocalEntityManagerFactoryBean();
		lemfb.setPersistenceUnitName("spitterPU");
		return lemfb;
	}
	
	/**
	 * 使用容器管理类型的JPA
	 * @param dataSource
	 * @param jpaVendorAdapter
	 * @return
	 */
//	@Bean
//	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter){ 
//		LocalContainerEntityManagerFactoryBean lcemfb = new LocalContainerEntityManagerFactoryBean();
//		lcemfb.setDataSource(dataSource);
//		lcemfb.setJpaVendorAdapter(jpaVendorAdapter);
//		lcemfb.setPackagesToScan(entities);
//		return lcemfb;
//	}
//	
//	@Bean
//	public JpaVendorAdapter jpaVendorAdapter() {
//		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
//		adapter.setDatabase(Database.ORACLE);
//		adapter.setShowSql(true);
//		adapter.setGenerateDdl(false);
//		adapter.setDatabasePlatform(dialect);
//		return adapter;
//	}
}
