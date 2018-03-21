/**
 * 
 */
package com.springinaction.chapter3.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.springinaction.chapter2.soundsystem.BlankDisc;

/**
 * @author MonkGirl
 *
 */
@Configuration
@PropertySource("classpath:/com/springinaction/chapter3/resources/app.properties")
public class ExpressiveConfig {

	@Autowired
	Environment env;
	
	@Bean
	public BlankDisc disc() {
		return new BlankDisc(env.getProperty("disc.title"), env.getProperty("disc.artist"));
	}
	
}
