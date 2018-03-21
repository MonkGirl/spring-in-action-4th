/**
 * 
 */
package com.springinaction.chapter3.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springinaction.chapter3.main.Computer;
import com.springinaction.chapter3.main.ComputerConfig;

/**
 * @author MonkGirl
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ComputerConfig.class)
public class TestSpingEL {

	@Autowired
	private Computer computer;
	
	@Test
	public void testEL() {
		assertNotNull("It's null",  computer);
		System.out.println(computer);
	}

}
