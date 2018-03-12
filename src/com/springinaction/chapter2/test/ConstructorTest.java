/**
 * 
 */
package com.springinaction.chapter2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.springinaction.chapter2.others.Discgraphy;
import com.springinaction.chapter2.soundsystem.BlankDisc;

/**
 * @author MonkGirl
 *
 */
public class ConstructorTest {
	private static final String classPath = "config.xml";
	private static final String sysFilePath = "E:/StudySpace/SpringInAction/src/config.xml";

	@Test
	public void testConstructor() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(classPath);
		BlankDisc disc1 = context.getBean(BlankDisc.class);
		BlankDisc disc2 = context.getBean(BlankDisc.class);
		assertEquals(disc1,disc2);
		assertNotNull("The disc is blank",disc1);
		disc1.play();
		//fail("Not yet implemented");
		context.close();
	}

	@Test
	public void testConstructorNew() {
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(sysFilePath);
		Discgraphy discgraphy = context.getBean(Discgraphy.class);
		discgraphy.show();
		context.close();
	}
}
