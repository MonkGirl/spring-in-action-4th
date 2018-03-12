/**
 * 
 */
package com.springinaction.chapter2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springinaction.chapter2.soundsystem.CDPlayer;
import com.springinaction.chapter2.soundsystem.CDPlayerConfig;
import com.springinaction.chapter2.soundsystem.CompactDisc;
import com.springinaction.chapter2.soundsystem.MediaPlayer;

/**
 * @author MonkGirl
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
	
	@SuppressWarnings("deprecation")
	@Rule
	public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	private CompactDisc cd;
	
	@Autowired
	private MediaPlayer player;
	
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void player() {
		player.play();
		assertEquals(
		        "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles", 
		        log.getLog());
	}
	
	@Test 
	public void testSetter() {
		cdPlayer.play();
	}
}
