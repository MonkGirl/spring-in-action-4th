/**
 * 
 */
package com.springinaction.chapter4.concert.main;

import org.springframework.stereotype.Component;

/**
 * @author MonkGirl
 *
 */
@Component
public class DefaultEncoreable implements Encoreable{

	/* (non-Javadoc)
	 * @see com.springinaction.chapter4.delegate.Encoreable#performEncore()
	 */
	@Override
	public void performEncore() {
		System.out.println("DefaultEncoreable...");
	}

}
