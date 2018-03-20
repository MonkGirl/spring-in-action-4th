/**
 * 
 */
package com.springinaction.chapter3.main;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author MonkGirl
 *
 */
public class MagicExistsCondition implements Condition{

	/* (non-Javadoc)
	 * @see org.springframework.context.annotation.Condition#matches(org.springframework.context.annotation.ConditionContext, org.springframework.core.type.AnnotatedTypeMetadata)
	 */
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		//Environment env = context.getEnvironment();
		//return env.containsProperty("magic");
		//return true;
		return false;
	}

}
