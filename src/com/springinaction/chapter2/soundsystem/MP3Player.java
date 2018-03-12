/**
 * 
 */
package com.springinaction.chapter2.soundsystem;

/**
 * @author MonkGirl
 *
 */
public class MP3Player implements MediaPlayer{

	private Audio audio;
	
	public void setAudio(Audio audio) {
		this.audio = audio;
	}
	
	/* (non-Javadoc)
	 * @see com.springinaction.chapter2.soundsystem.MediaPlayer#play()
	 */
	@Override
	public void play() {
		audio.play();
	}

}
