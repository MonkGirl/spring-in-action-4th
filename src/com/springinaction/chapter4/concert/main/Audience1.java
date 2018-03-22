/**
 * 
 */
package com.springinaction.chapter4.concert.main;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author MonkGirl
 *
 */
//@Aspect//定义此类是一个切面
public class Audience1 {
	//定义一个切点Pointcut
	@Pointcut("execution(** com.springinaction.chapter4.concert.main.Performance.perform(..))")
	public void performance() {}//该方法应该时空的，方法本身只是一个标识，供@Pointcut注解依附
	
	@Before("performance()")
	public void silenceCellPhones() {
		System.out.println("Silencing cell phones");
	}
	
	@Before("performance()")
	public void takeSeats() {
		System.out.println("Taking seats");
	}
	
	@AfterReturning("performance()")
	public void applause() {
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Demanding a refund");
	}
}
