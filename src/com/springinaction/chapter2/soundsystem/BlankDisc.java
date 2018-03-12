/**
 * 
 */
package com.springinaction.chapter2.soundsystem;

import java.util.List;

/**
 * @author MonkGirl
 *
 */
public class BlankDisc implements CompactDisc{

	private String titles;
	private String artist;
	private List<String> tracks;
	
	public BlankDisc() {
		super();
	}
	
	public BlankDisc(String titles, String artist, List<String> tracks) {
		this.titles = titles;
		this.artist = artist;
		this.tracks = tracks;
	}
	
	public BlankDisc(String titles, String artist) {
		this.titles = titles;
		this.artist = artist;
	}
	
	/* (non-Javadoc)
	 * @see com.springinaction.chapter2.soundsystem.CompactDisc#play()
	 */
	@Override
	public void play() {
		System.out.println("Palying " + titles + " by " + artist);
//		for(String track : tracks) {
//			System.out.println("-Track: " + track);
//		}
	}

	public String toString() {
		return artist + " - " + titles;
	}
}
