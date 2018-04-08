/**
 * 
 */
package com.springinaction.chapter7.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.ISpringTemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

/**
 * @author MonkGirl
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.springinaction.chapter7")
public class WebConfig implements WebMvcConfigurer, ApplicationContextAware {

//	@Bean
//	public ViewResolver viewResolver() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/WEB-INF/layout/");
//		resolver.setSuffix(".jsp");
//		resolver.setExposeContextBeansAsAttributes(true);
//		return resolver;
//	}
	
//	@Bean
//	public TilesConfigurer tilesConfigurer() {
//		TilesConfigurer tiles = new TilesConfigurer();
//		//tiles.setDefinitions(new String[] {"/WEB-INF/layout/tiles.xml"});//指定tiles定义的位置
//		tiles.setDefinitions(new String[] {"/WEB-INF/**/spittr.xml"});//使用Ant风格的通配符**
//		tiles.setCheckRefresh(true);//启用刷新功能
//		return tiles;
//	}
	
//	@Bean
//	public ViewResolver viewResolver() {
//		return new TilesViewResolver();
//	}
	
	
	private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext context) {
		applicationContext = context;
	}
	//Thymeleaf视图解析器
	@Bean
	public ViewResolver viewResolver() {
		ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
		viewResolver.setTemplateEngine(templateEngine());
		viewResolver.setCharacterEncoding("UTF-8");
		return viewResolver;
	}
	
	//模板引擎
	@Bean
	public ISpringTemplateEngine templateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setEnableSpringELCompiler(true);
		templateEngine.setTemplateResolver(templateResolver());
		return templateEngine;
	}
	
	private ITemplateResolver templateResolver() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setApplicationContext(applicationContext);
		templateResolver.setPrefix("/WEB-INF/templates/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML");
		return templateResolver;
	}
	
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
