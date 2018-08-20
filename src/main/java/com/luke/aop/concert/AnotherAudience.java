package com.luke.aop.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AnotherAudience {

	@Pointcut("execution(* com.luke.aop.concert.Performance.perform(..)) && within(com.luke.aop.concert.*)")
	public void performance() {

	}

	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinPoint) {
		try {
			System.out.println("find a seat by another audience");
			System.out.println("close cell phones by another audience");
			joinPoint.proceed();
			System.out.println("CLAP, CLAP, CLAP by another audience");
		} catch (Throwable throwable) {
			System.out.println("demand refund by another audience");
		}

	}
}
