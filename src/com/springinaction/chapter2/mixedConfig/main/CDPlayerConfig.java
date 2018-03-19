/**
 * 
 */
package com.springinaction.chapter2.mixedConfig.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author MonkGirl
 *
 */
@Configuration
//@Import(CDConfig.class)
public class CDPlayerConfig {
	@Bean
	public CDPlayer cdPlayer(CompactDisc compactDisc) {
		System.out.println("==CDPlayerConfig===========");
		return new CDPlayer(compactDisc);
	}
}
