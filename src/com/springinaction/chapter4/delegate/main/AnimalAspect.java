/**
 * 
 */
package com.springinaction.chapter4.delegate.main;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author MonkGirl
 *
 */
@Aspect
@Component
public class AnimalAspect {
	@DeclareParents(value="com.springinaction.chapter4.delegate.main.Person+",defaultImpl=Human.class)
	public Animal animal;
}
