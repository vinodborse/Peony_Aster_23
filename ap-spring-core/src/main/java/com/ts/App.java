package com.ts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	
    	Common c1 = ac.getBean("cm", Common.class);
    	System.out.println(c1);
    	
    	Common c2 = ac.getBean("cm", Common.class);
    	System.out.println(c2);
    	
    	Common c3 = ac.getBean("cm", Common.class);
    	System.out.println(c3);
    	
    	//    	c1.hello();
    	System.out.println("========================================");
    	
    	Common ca = new Teacher();
    	System.out.println(ca);
    	
    	Common cb = new Teacher();
    	System.out.println(cb);
    	
    	Common cc = new Teacher();
    	System.out.println(cc);
    	
    	
    }
}
