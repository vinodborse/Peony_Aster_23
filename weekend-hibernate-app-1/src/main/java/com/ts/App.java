package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
    										   .addAnnotatedClass(Student.class)
    										   .addAnnotatedClass(Teacher.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	session.beginTransaction();
    	//------
    		//INSERT INTO student VALUE (1, "Vinod", "Pune");
   	Student s = new Student();
   		
    	s.setName("Vinod");
    	s.setAddress("Pune");
    	
  
    	
    	session.persist(s);
    	
//    	SELECT * FROM student WHERE rollno = 5;
    	
    	//Student std = session.get(Student.class, 3);
    	//System.out.println("Student name is = "+ std.getName());
    	//------
    	session.getTransaction().commit();
    	session.close();
    }
}
