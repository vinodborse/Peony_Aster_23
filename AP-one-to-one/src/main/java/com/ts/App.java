package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(Pan.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		//-----
		
		Pan p1 = new Pan();		
		p1.setId(101);
		p1.setNumber("ABC123A");
		
		User u1 = new User();
		u1.setId(1);
		u1.setName("Vinod");
		u1.setPan(p1);
		
		session.persist(u1);
		session.persist(p1);
		
		
    	//-----
    	session.getTransaction().commit();
    	session.close();

    }
}
