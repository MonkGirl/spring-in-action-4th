/**
 * 
 */
package com.springinaction.chapter2.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.springinaction.chapter2.soundsystem.MP3Player;

/**
 * @author MonkGirl
 *
 */
public class XmlConfigTest {
	
	private static final String classPath = "config.xml";
	private static final String sysFilePath = "E:/StudySpace/SpringInAction/src/config.xml";
	
	private static ClassPathXmlApplicationContext cpContext;
	private static FileSystemXmlApplicationContext fsContext;
	static {
		cpContext = new ClassPathXmlApplicationContext(classPath);
		fsContext = new FileSystemXmlApplicationContext(sysFilePath);
	}
	
	@Test
	public void testSetProperties() {
		MP3Player player = cpContext.getBean(MP3Player.class);
		player.play();
	}


}
