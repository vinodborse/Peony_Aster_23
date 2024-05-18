package com.ts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	Test t = ac.getBean("t", Test.class);
    	t.testMethod1();
    	//System.out.println("============");
    	//t.testMethod2();
    }
}
