/**
 * 
 */
package com.springinaction.chapter4.xmlAspect.main;

import java.util.HashMap;

/**
 * @author MonkGirl
 *
 */
public class TrackCounter {
	private HashMap<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();
	
	public void countTrack(int trackNumber) {
		int currentCount = getPlayCount(trackNumber);
		trackCounts.put(trackNumber, currentCount+1);
	}
	
	public int getPlayCount(int trackNumber) {
		return trackCounts.containsKey(trackNumber)?trackCounts.get(trackNumber):0;
	}
}
