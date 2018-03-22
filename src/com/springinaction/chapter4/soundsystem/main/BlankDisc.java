/**
 * 
 */
package com.springinaction.chapter4.soundsystem.main;

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
	
	public void setTitles(String titles) {
		this.titles = titles;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}
	/* (non-Javadoc)
	 * @see com.springinaction.chapter2.soundsystem.CompactDisc#play()
	 */
	@Override
	public void play() {
		System.out.println("Palying " + titles + " by " + artist);
		for(String track : tracks) {
			System.out.println("-Track: " + track);
		}
	}

	public String toString() {
		return artist + " - " + titles;
	}

	/* (non-Javadoc)
	 * @see com.springinaction.chapter4.soundsystem.main.CompactDisc#playTrack(int)
	 */
	@Override
	public void playTrack(int track) {
		// TODO Auto-generated method stub
		
	}
}
