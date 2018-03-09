/**
 * 
 */
package com.springinaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springinaction.entity.knights.BraveKnight;
import com.springinaction.entity.knights.Knight;
import com.springinaction.entity.knights.SlayDragonQuest;
import com.springinaction.entity.quest.Quest;

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
