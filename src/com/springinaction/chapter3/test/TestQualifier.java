/**
 * 
 */
package com.springinaction.chapter3.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springinaction.chapter3.main.Cold;
import com.springinaction.chapter3.main.Dessert;
import com.springinaction.chapter3.main.MagicBean;
import com.springinaction.chapter3.main.MagicConfig;

/**
 * @author MonkGirl
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MagicConfig.class)
public class TestQualifier {

	@Autowired
	@Qualifier("magicBean")
	private MagicBean magicBean; 
	
	@Autowired
	@Qualifier("cookies")
	private Dessert dessert1;
	
	@Autowired
	@Qualifier("cookies")
	private Dessert dessert2;
	
	@Test
	public void testCondition() {
		assertNotNull("It's true", magicBean.magicBean());
		//System.out.println(magicBean.magicBean());;
	}
	
	@Test
	public void testDessert() {
		assertNotNull("It's null", dessert1);
		dessert1.goDinner();
		assertEquals("not equals", dessert1, dessert2);
	}

}
