package com.springinaction.chapter7.javaConfig;


import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DemoWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return null;
	}

	protected void customizedRegistration(Dynamic registration) {
		//启用multipart请求和文件上传。
		registration.setMultipartConfig(new MultipartConfigElement("/tmp/spittr/uploads"));
		registration.setLoadOnStartup(1);//设置load-on-startup优先级
	}
}
