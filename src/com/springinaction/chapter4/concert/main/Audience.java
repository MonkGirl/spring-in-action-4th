/**
 * 
 */
package com.springinaction.chapter4.concert.main;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author MonkGirl
 *
 */
@Aspect//定义此类是一个切面
public class Audience {
	//定义一个切点Pointcut
	@Pointcut("execution(** com.springinaction.chapter4.concert.main.Performance.perform(..))")
	public void performance() {}//该方法应该时空的，方法本身只是一个标识，供@Pointcut注解依附
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		}catch(Throwable a) {
			System.out.println("Demanding a refund");
		}
	}
}
