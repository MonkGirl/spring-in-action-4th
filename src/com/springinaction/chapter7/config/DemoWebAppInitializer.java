package com.springinaction.chapter7.config;


import java.io.IOException;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DemoWebAppInitializer {//extends AbstractAnnotationConfigDispatcherServletInitializer{

//	@Override
//	protected Class<?>[] getRootConfigClasses() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	protected Class<?>[] getServletConfigClasses() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	protected String[] getServletMappings() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	protected void customizedRegistration(Dynamic registration) {
//		//启用multipart请求和文件上传。
//		//registration.setMultipartConfig(new MultipartConfigElement("/tmp/spittr/uploads"));
//		//文件大小不超过2MB，整个请求不超过4MB，所有文件写入磁盘
//		registration.setMultipartConfig(new MultipartConfigElement("/tmp/spittr/uploads", 2097152, 4194304, 0));
//		registration.setLoadOnStartup(1);//设置load-on-startup优先级
//	}
}
