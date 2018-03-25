/**
 * 
 */
package com.springinaction.chapter4.xmlAspect.main;

/**
 * @author MonkGirl
 *
 */
public class TurbineEngine implements Engine{

	/* (non-Javadoc)
	 * @see com.springinaction.chapter4.xmlAspect.main.Engine#power()
	 */
	@Override
	public void power() {
		System.out.println("This a Turbine engine.");
	}

}
