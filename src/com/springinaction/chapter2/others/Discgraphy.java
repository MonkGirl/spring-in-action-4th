/**
 * 
 */
package com.springinaction.chapter2.others;

import java.util.List;

import com.springinaction.chapter2.soundsystem.CompactDisc;

/**
 * @author MonkGirl
 *
 */
public class Discgraphy {
    private String artist;
    private List<CompactDisc> cds;
    
    public Discgraphy(String artist, List<CompactDisc> cds) {
    	this.artist = artist;
    	this.cds = cds;
    }
    
    public void show() {
    	System.out.println("The artist is " + artist + " and discgraphy are :");
    	for(CompactDisc cd : cds) {
    		System.out.println(cd);
    	}
    }
}
