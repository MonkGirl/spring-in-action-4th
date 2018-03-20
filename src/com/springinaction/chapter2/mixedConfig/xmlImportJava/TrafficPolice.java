/**
 * 
 */
package com.springinaction.chapter2.mixedConfig.xmlImportJava;

/**
 * @author MonkGirl
 *
 */
public class TrafficPolice implements Police{
	
	public TrafficPolice() {
		
	}

	/* (non-Javadoc)
	 * @see com.springinaction.chapter2.mixedConfig.xmlImportJava.Police#work()
	 */
	@Override
	public void work() {
		System.out.println("Traffic police");
	}

}
