package com.luke.aop.concert;

import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

	@Pointcut("execution(* com.luke.aop.concert.Performance.perform(..))")
	private void performace() {

	}

//	@Before("execution(* com.luke.aop.concert.Performance.perform(..))")
	@Before("performace()")
	public void silenceCellPhone() {
		System.out.println("silence cellphone");
	}

//	@Before("execution(* com.luke.aop.concert.Performance.perform(..))")
	@Before("performace()")
	public void findSeat() {
		System.out.println("find a seat");
	}
	
//	@AfterReturning("execution(* com.luke.aop.concert.Performance.perform(..))")
	@AfterReturning("performace()")
	public void applause() {
		System.out.println("clap, clap, clap~");
	}

//	@AfterThrowing("execution(* com.luke.aop.concert.Performance.perform(..))")
	@AfterThrowing("performace()")
	public void demandRefund() {
		System.out.println("demand refund");
	}
}
