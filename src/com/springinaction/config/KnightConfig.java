/**
 * 
 */
package com.springinaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springinaction.entity.BraveKnight;
import com.springinaction.entity.Knight;
import com.springinaction.entity.Quest;
import com.springinaction.entity.SlayDragonQuest;

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
