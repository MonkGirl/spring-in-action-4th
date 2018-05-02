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
	public LocalEntityManagerFactoryBean applicationEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean lemfb = new LocalEntityManagerFactoryBean();
		lemfb.setPersistenceUnitName("spitterPU");
		return lemfb;
	}
}
