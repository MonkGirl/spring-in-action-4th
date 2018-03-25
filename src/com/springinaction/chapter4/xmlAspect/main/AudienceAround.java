/**
 * 
 */
package com.springinaction.chapter4.xmlAspect.main;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author MonkGirl
 *
 */
public class AudienceAround {
	
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
		} catch (Throwable e) {
			System.out.println("Demanding a refund");
			e.printStackTrace();
		}
		System.out.println("CLAP CLAP CLAP!!!");
	}
}
