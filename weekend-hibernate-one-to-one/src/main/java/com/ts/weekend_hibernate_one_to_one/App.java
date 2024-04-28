package com.ts.weekend_hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
				   .addAnnotatedClass(Student.class)
				   .addAnnotatedClass(Marks.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		//------
		
		Student s = new Student();
		s.setRollno(1);
		s.setName("Vinod");
//		s.setMarks(null);
		
		Marks m = new Marks();
		m.setId(101);
		m.setEnglish(90);
		m.setMath(100);
		
		
		s.setMarks(m);
		
		session.persist(s);
		session.persist(m);
		
		//------
		session.getTransaction().commit();
		session.close();
    }
}
