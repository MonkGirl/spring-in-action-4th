/**
 * 
 */
package com.springinaction.chapter1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springinaction.chapter1.entity.BraveKnight;
import com.springinaction.chapter1.entity.Knight;
import com.springinaction.chapter1.entity.Quest;
import com.springinaction.chapter1.entity.SlayDragonQuest;

/**
 * @author MonkGirl
 *
 */

@Configuration
public class KnightConfig {

	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
}
