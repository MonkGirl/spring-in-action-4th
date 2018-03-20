/**
 * 
 */
package com.springinaction.chapter3.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @author MonkGirl
 *
 */
@Component("magicBean")
public class MagicBean {

	@Bean("bean")
	@Conditional(MagicExistsCondition.class)
	public MagicBean magicBean () {
		return new MagicBean();
	}
	
	public String toString() {
		return "MagicBean";
	}
}
