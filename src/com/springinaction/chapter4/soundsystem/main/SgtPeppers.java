/**
 * 
 */
package com.springinaction.chapter4.soundsystem.main;

import org.springframework.stereotype.Component;

/**
 * @author MonkGirl
 *
 */
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

	/* (non-Javadoc)
	 * @see com.springinaction.chapter4.soundsystem.main.CompactDisc#playTrack(java.lang.String)
	 */
	@Override
	public void playTrack(int track) {
		// TODO Auto-generated method stub
		
	}

	
}
