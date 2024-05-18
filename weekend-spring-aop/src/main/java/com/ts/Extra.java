package com.ts;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Extra {

/*
	@Before("execution(public void testMethod1())")
	public void m1() {
		System.out.println("Method has been started");
	}

	
	@After("execution(public void testMethod1())")
	public void m2() {
		System.out.println("We are done with method...");
	}
*/	

	
/*
	  @Before("execution(public void test*())") public void m1() {
	  System.out.println("Method has been started"); }
*/	
	@Around("execution(public void testMethod1())")
	public void m4(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Method has been started");
		System.out.println("Start");
		pjp.proceed();
		System.out.println("End");
		System.out.println("We are done with method...");
	}
	
}

/*
*ya
vi*

*o*

	Vinod
	Don
Aliya
	Salmon
Raghav
Vitthal
Anarkali
	Soniya
Virat
	Rohit
Om
Ramo

==================

testMethod1
testMethod2
sampleMethod1
sampleMethod2
Method


test*

*method*

*/








