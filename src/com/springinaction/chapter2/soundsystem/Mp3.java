/**
 * 
 */
package com.springinaction.chapter2.soundsystem;

/**
 * @author MonkGirl
 *
 */
public class Mp3 implements Audio{

	/* (non-Javadoc)
	 * @see com.springinaction.chapter2.soundsystem.Audio#play()
	 */
	@Override
	public void play() {
		System.out.println("Playing audio by mp3.");
	}

}
