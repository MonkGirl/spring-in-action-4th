/**
 * 
 */
package com.springinaction.chapter4.delegate.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author MonkGirl
 *
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class DelegateConfig {
//	@DeclareParents(value="com.springinaction.chapter4.delegate.Animal+", defaultImpl=Human.class)
//	public Animal animal;
}
