/**
 * 
 */
package com.springinaction.chapter4.xmlAspect.main;

import java.util.List;

/**
 * @author MonkGirl
 *
 */
public class BlankDisc implements CompactDisc{
	
	private String title;
	private String artist;
	private List<String> tracks;

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<String> getTracks() {
		return tracks;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}


	/* (non-Javadoc)
	 * @see com.springinaction.chapter4.xmlAspect.main.CompactDisc#playTrack(int)
	 */
	@Override
	public void playTrack(int trackNumber) {
		// TODO Auto-generated method stub
		
	}
}
