/**
 * 
 */
package com.springinaction.chapter4.delegate.main;

import org.springframework.stereotype.Component;

/**
 * @author MonkGirl
 *
 */
@Component
public class Human implements Animal {

	/* (non-Javadoc)
	 * @see com.springinaction.chapter4.delegate.Animal#sleep()
	 */
	@Override
	public void sleep() {
		System.out.println("Sleep in night.");
	}

}
