/**
 * 
 */
package com.springinaction.chapter4.xmlAspect.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.chapter4.xmlAspect.main.CompactDisc;
import com.springinaction.chapter4.xmlAspect.main.Engine;
import com.springinaction.chapter4.xmlAspect.main.Machine;
import com.springinaction.chapter4.xmlAspect.main.Performance;
import com.springinaction.chapter4.xmlAspect.main.TrackCounter;

/**
 * @author MonkGirl
 *
 */
//@SpringJUnitConfig
//@ContextConfiguration("classpath:/com/springinaction/chapter4/xmlAspect/resources/aspectConfig.xml")
class TestXmlAspect {

	private ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springinaction/chapter4/xmlAspect/resources/aspectConfig.xml");
	
	@Test
	void testAspect() {
		Performance performance = (Performance) context.getBean("performance");
		performance.perform();
	}

	@Test
	void testAspectArg() {
		CompactDisc cd = (CompactDisc) context.getBean("compactDisc");
		TrackCounter counter =  (TrackCounter) context.getBean("trackCounter");
		
		cd.playTrack(1);
		cd.playTrack(1);
		cd.playTrack(3);
		cd.playTrack(5);
		cd.playTrack(5);
		cd.playTrack(6);
		cd.playTrack(7);
		
//		System.out.println(counter.getPlayCount(1));
//		System.out.println(counter.getPlayCount(2));
//		System.out.println(counter.getPlayCount(3));
//		System.out.println(counter.getPlayCount(4));
//		System.out.println(counter.getPlayCount(5));
//		System.out.println(counter.getPlayCount(6));
//		System.out.println(counter.getPlayCount(7));
		
		assertEquals(2, counter.getPlayCount(1));
		assertEquals(0, counter.getPlayCount(2));
		assertEquals(1, counter.getPlayCount(3));
		assertEquals(0, counter.getPlayCount(4));
		assertEquals(2, counter.getPlayCount(5));
		assertEquals(1, counter.getPlayCount(6));
		assertEquals(1, counter.getPlayCount(7));
	}
	
	@Test
	public void testImport() {
		Machine machine = (Machine) context.getBean("machine");
		machine.work();
		Engine engine = (Engine) machine;
		engine.power();
	}
}
