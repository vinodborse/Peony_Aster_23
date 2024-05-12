package com.ts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	
/*    	Student s = ac.getBean("s", Student.class);
    	System.out.println(s.getName());
    	
    	Student s1 = ac.getBean("s1", Student.class);
    	System.out.println(s1.getName());
*/
    	Employee e = ac.getBean("e1", Employee.class);
    	e.emp();
    }
}
