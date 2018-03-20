/**
 * 
 */
package com.springinaction.chapter2.mixedConfig.xmlImportJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author MonkGirl
 *
 */
@Configuration
public class PoliceConfig {

	@Bean
	public Police police() {
		return new TrafficPolice();
	}
}
