/**
 * 
 */
package com.springinaction.chapter4.soundsystem.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.springinaction.chapter4.soundsystem.main.BlankDisc;
import com.springinaction.chapter4.soundsystem.main.CompactDisc;
import com.springinaction.chapter4.soundsystem.main.TrackCounter;

/**
 * @author MonkGirl
 *
 */
@Configuration
@ComponentScan("com.springinaction.chapter4.soundsystem.*")
@EnableAspectJAutoProxy
public class TrackCounterConfig {
	
	@Bean
	public CompactDisc setPeppers() {
		BlankDisc cd = new BlankDisc();
		cd.setTitles("Sgt. Pepper's Lonely Hearts Club Band");
		cd.setArtist("The Beatles");
		List<String> tracks = new ArrayList<String>();
		tracks.add("Sgt. Pepper's Lonely Hearts Club Band");
		tracks.add("With a Little Help from My Friends");
		tracks.add("Lucy in the Sky with Diamonds");
		tracks.add("Getting Better");
		tracks.add("Fixing a Hole");
		cd.setTracks(tracks);
		return cd;
	}
	
	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}
}
