/**
 * 
 */
package com.springinaction.chapter2.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author MonkGirl
 *
 */
@Component
public class CDPlayer implements MediaPlayer{

	private CompactDisc cd;
	
	@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	@Autowired
	public void setCompactDisc(CompactDisc cd) {
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
