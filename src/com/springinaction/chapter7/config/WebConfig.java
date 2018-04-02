package com.springinaction.chapter7.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.springinaction.chapter7.config")
public class WebConfig implements WebMvcConfigurer{

	@Bean
	public MultipartResolver multipartResolver() throws IOException{
		//使用优先方案
		//return new StandardServletMultipartResolver();
		//无法设定请求的整体最大容量
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setUploadTempDir(new FileSystemResource("/tmp/spittr/uploads"));
		resolver.setMaxUploadSize(2097152);//文件大小
		resolver.setMaxInMemorySize(0);//最大内存设置为0，写入磁盘
		return resolver;
	}
}
