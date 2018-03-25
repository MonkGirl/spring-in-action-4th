/**
 * 
 */
package com.springinaction.chapter4.xmlAspect.main;

/**
 * @author MonkGirl
 *
 */
public class Vehicle implements Machine{

	/* (non-Javadoc)
	 * @see com.springinaction.chapter4.xmlAspect.main.Machine#work()
	 */
	@Override
	public void work() {
		System.out.println("traffic tools...");
	}

}
