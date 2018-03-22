/**
 * 
 */
package com.springinaction.chapter4.concert.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.springinaction.chapter4.concert.main.Audience;

/**
 * @author MonkGirl
 *
 */
@Configuration
@ComponentScan("com.springinaction.chapter4.concert.*,com.springinaction.chapter4.delegate.*")
//@ComponentScan
@EnableAspectJAutoProxy
public class ConcertConfig {

	@Bean
	public Audience audience() {
		return new Audience();
	}
}
