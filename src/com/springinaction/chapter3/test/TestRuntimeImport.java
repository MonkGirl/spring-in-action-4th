/**
 * 
 */
package com.springinaction.chapter3.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springinaction.chapter3.main.ExpressiveConfig;

/**
 * @author MonkGirl
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ExpressiveConfig.class)
public class TestRuntimeImport {

	@Autowired
	private ExpressiveConfig config;
	
	@Test
	public void testEnv() {
		System.out.println(config.disc());
	}

}
