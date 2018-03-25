/**
 * 
 */
package com.springinaction.chapter4.xmlAspect.main;

/**
 * @author MonkGirl
 *
 */
public class MusicPerformance implements Performance{

	/* (non-Javadoc)
	 * @see com.springinaction.chapter4.xmlAspect.main.Performance#perform()
	 */
	@Override
	public void perform() {
		System.out.println("Music Performance...");
	}

}
