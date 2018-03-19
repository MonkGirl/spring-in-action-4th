/**
 * 
 */
package com.springinaction.chapter2.mixedConfig.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author MonkGirl
 *
 */
@Configuration
public class CDConfig {
	@Bean
	public CompactDisc compactDisc() {
		return new SgtPeppers();
	}
}
