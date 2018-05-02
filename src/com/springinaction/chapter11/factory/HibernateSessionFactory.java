package com.springinaction.chapter11.factory;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class HibernateSessionFactory {

	private static String[] entities = {
			"com.springinaction.chapter11.entity"};
	
	@Autowired
	private DataSource dataSource;

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(dataSource);
		lsfb.setPackagesToScan(entities);
		// 确定指定少量的域类
		//lsfb.setAnnotatedClasses(new Class<?>[] {Spitter.class});
		Properties props = new Properties();
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.format_sql", "true");
		lsfb.setHibernateProperties(props);
		return lsfb;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transaction(@Qualifier("sessionFactory")SessionFactory localSessionFactoryBean) {
		HibernateTransactionManager manager = new HibernateTransactionManager(localSessionFactoryBean);
		return manager;
	}
	
	/**
	 * 添加异常转换功能
	 * @return
	 */
	@Bean
	public BeanPostProcessor persistenceTransaction() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
}
