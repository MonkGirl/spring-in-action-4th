/**
 * 
 */
package com.springinaction.chapter4.delegate.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.springinaction.chapter4.delegate.main.Animal;
import com.springinaction.chapter4.delegate.main.DelegateConfig;
import com.springinaction.chapter4.delegate.main.Person;

/**
 * @author MonkGirl
 *
 */
@SpringJUnitConfig(classes=DelegateConfig.class)
class TestDelegate {

	@Autowired
	private Person person;
	
	@Test
	void testDelegate() {
		person.work();
		Animal animal = (Animal) person;
		animal.sleep();
	}

}
