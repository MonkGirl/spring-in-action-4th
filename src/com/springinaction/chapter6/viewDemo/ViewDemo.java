package com.springinaction.chapter6.viewDemo;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

public class ViewDemo {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		//解析为JstlView
		resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
		return null;
	}
	
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}
	
	@Bean
	public MessageSource reloadableMessageSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:/properties/message");
		messageSource.setCacheSeconds(10);
		return messageSource;
	}
	
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tiles = new TilesConfigurer();
		//tiles.setDefinitions(new String[] {"/WEB-INF/layout/tiles.xml"});//指定tiles定义的位置
		tiles.setDefinitions(new String[] {"/WEB-INF/**/tiles.xml"});//使用Ant风格的通配符**
		tiles.setCheckRefresh(true);//启用刷新功能
		return tiles;
	}
	
	@Bean
	public ViewResolver tilesViewResolver() {
		return new TilesViewResolver();
	}
}
