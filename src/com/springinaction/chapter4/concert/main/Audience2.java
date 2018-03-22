/**
 * 
 */
package com.springinaction.chapter4.concert.main;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author MonkGirl
 *
 */
//@Aspect//定义此类是一个切面
public class Audience2 {
	@Before("execution(** com.springinaction.chapter4.concert.Performance.perform(..))")
	public void silenceCellPhones() {
		System.out.println("Silencing cell phones");
	}
	
	@Before("execution(** com.springinaction.chapter4.concert.Performance.perform(..))")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
	
	@AfterReturning("execution(** com.springinaction.chapter4.concert.Performance.perform(..))")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("execution(** com.springinaction.chapter4.concert.Performance.perform(..))")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
}
