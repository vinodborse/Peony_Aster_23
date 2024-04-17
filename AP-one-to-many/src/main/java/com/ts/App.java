package com.ts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
				.addAnnotatedClass(Document.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		//-----
		
		User u1 = new User();
		u1.setId(1);
		u1.setName("Vinod");
//		u1.setDocuments(null);
	
		Document d1 = new Document(101, "Aadhar", "1234");
		Document d2 = new Document(102, "Pan", "ABC123A");

		List<Document> docs = new ArrayList<>();
								
		docs.add(d1);
		docs.add(d2);
		
		//List<Document> docs1 = Arrays.asList(d1, d2);
		
		u1.setDocuments(docs);
		
		
		User u2 = new User();
		u2.setId(2);
		u2.setName("Don");
		u2.setDocuments(docs);
		
		session.persist(u1);
		session.persist(u2);
		session.persist(d1);
		session.persist(d2);
    	//-----
    	session.getTransaction().commit();
    	session.close();

    }
}
