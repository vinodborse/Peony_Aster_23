package com.ts;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Sample {

/*	@Before("execution(public void *DataMethod())")
	public void data() {
		System.out.println("Welcome");
	}
	
	@After("execution(public void stdDataMethod())")
	public void m1() {
		System.out.println("End");
	} 
*/
	
	@Around("execution(public void stdDataMethod())")
	public void m2(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Start");
		pjp.proceed();
		System.out.println("Finish");
	}
		
}