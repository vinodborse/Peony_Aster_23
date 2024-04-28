package com.ts;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure("hibernate.cfg.xml")
				   .addAnnotatedClass(User.class)
				   .addAnnotatedClass(Document.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		//------
		
		User u1 = new User();
		u1.setId(1);
		u1.setName("Vinod");
		
//		u.setDocuments(null);
	
		Document d1 = new Document();
		
		d1.setId(101);
		d1.setType("Aadhar card");
		d1.setNumber("12345");
		
		Document d2 = new Document(102, "Pan card", "123ABC1");
		
		List<Document> docs = new ArrayList<>();
		
		docs.add(d1);
		docs.add(d2);
		
		u1.setDocuments(docs);
		
		User u2 = new User(2, "Don", docs);
		
		session.persist(u1);
		session.persist(u2);
		session.persist(d1);
		session.persist(d2);
		
		//------
		session.getTransaction().commit();
		session.close();
    }
}
