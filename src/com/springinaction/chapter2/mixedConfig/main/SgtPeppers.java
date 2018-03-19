/**
 * 
 */
package com.springinaction.chapter2.mixedConfig.main;

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

}
