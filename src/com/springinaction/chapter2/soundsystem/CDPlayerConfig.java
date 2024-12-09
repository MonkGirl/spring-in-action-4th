/**
 * 
 */
package com.springinaction.chapter2.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author MonkGirl
 *
 */
@Configuration
//@ComponentScan
public class CDPlayerConfig {
	@Bean
	public CDPlayer cdPlayer(CompactDisc cd) {
		return new CDPlayer(cd);
	}
}
