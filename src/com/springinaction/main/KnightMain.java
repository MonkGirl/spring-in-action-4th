/**
 * 
 */
package com.springinaction.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.entity.knights.Knight;

/**
 * @author MonkGirl
 *
 */
public class KnightMain {
    public static void main(String[] args) {
    	//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knight.xml");
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("minstrel.xml");
    	Knight knight = (Knight) context.getBean("knight");
    	knight.embarkOnQuest();
    	context.close();
    }
}
