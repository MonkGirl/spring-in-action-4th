/**
 * 
 */
package com.springinaction.chapter4.concert.main;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * @author MonkGirl
 *
 */
@Aspect
@Component
public class EncoreableIntroducer {
	@DeclareParents(value="com.springinaction.chapter4.concert.main.Performance+", defaultImpl=DefaultEncoreable.class)
	public static Encoreable encoreable;
}
