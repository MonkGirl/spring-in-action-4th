/**
 * 
 */
package com.springinaction.chapter3.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springinaction.chapter3.main.MagicBean;
import com.springinaction.chapter3.main.MagicConfig;

/**
 * @author MonkGirl
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MagicConfig.class)
public class Tests {

	@Autowired
	@Qualifier("magicBean")
	private MagicBean magicBean; 
	
	@Test
	public void testCondition() {
		assertNotNull("It's true",magicBean.magicBean());
		//System.out.println(magicBean.magicBean());;
	}

}
