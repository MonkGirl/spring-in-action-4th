/**
 * 
 */
package com.springinaction.chapter4.concert.main;

import org.springframework.stereotype.Component;

/**
 * @author MonkGirl
 *
 */
@Component("musicPerformance")
public class MusicPerformance implements Performance{

	/* (non-Javadoc)
	 * @see com.springinaction.chapter4.concert.main.Performance#perform()
	 */
	@Override
	public void perform() {
		System.out.println("Playing musics");
		//throw new RuntimeException("power down!");
	}

}
