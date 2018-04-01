package com.springinaction.chapter7.javaConfig;

import javax.servlet.Filter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;

import com.springinaction.chapter7.filter.MyFilter;
import com.springinaction.chapter7.servlet.MyServlet;

public class MyServletInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//注册servlet
		Dynamic myServlet = servletContext.addServlet("myServlet", MyServlet.class);
		//映射servlet
		myServlet.addMapping("/custom/**");
		
		//注册Filter
		javax.servlet.FilterRegistration.Dynamic myFilter = servletContext.addFilter("myFilter", MyFilter.class);
		//映射Filter
		myFilter.addMappingForUrlPatterns(null, false, "/custom/**");
	}
}
