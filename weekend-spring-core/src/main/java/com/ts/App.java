package com.ts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	
    	Student s1 = new Student();
    	System.out.println(s1);
    	Student s2 = new Student();
    	System.out.println(s2);
    	Student s3 = new Student();
    	System.out.println(s3);
    	
    	System.out.println("===============================");
    	
    	Student st1 = ac.getBean("s", Student.class);
    	System.out.println(st1);

    	Student st2 = ac.getBean("s", Student.class);
    	System.out.println(st2);

    	Student st3 = ac.getBean("s", Student.class);
    	System.out.println(st3);

    	
    }
}
