package com.springinaction.chapter9.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.springinaction.chapter9","com.springinaction.chapter10"})
public class RootConfig {

}
