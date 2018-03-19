/**
 * 
 */
package com.springinaction.chapter2.mixedConfig.main;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author MonkGirl
 *
 */
public class CDPlayer implements MediaPlayer{

	private CompactDisc cd;
	
	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	/* (non-Javadoc)
	 * @see com.springinaction.chapter2.soundsystem.MediaPlayer#play()
	 */
	@Override
	public void play() {
		cd.play();
	}

}
