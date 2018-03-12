/**
 * 
 */
package com.springinaction.chapter2.soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author MonkGirl
 *
 */
@Component("sgtPeppers")
public class SgtPeppers implements CompactDisc{
	
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	
	private String artist = "The Beatles";

	/* (non-Javadoc)
	 * @see com.springinaction.chapter2.soundsystem.CompactDisc#play()
	 */
	@Override
	public void play() {
		System.out.print("Playing " + title + " by " + artist);
	}

}
