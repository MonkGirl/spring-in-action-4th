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
public class Programmer implements Person{

	/* (non-Javadoc)
	 * @see com.springinaction.chapter4.delegate.Person#work()
	 */
	@Override
	public void work() {
		System.out.println("Programming...");
	}

}
