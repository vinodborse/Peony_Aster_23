package com.ts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration()
    							.configure("hibernate.cfg.xml")
    							.addAnnotatedClass(Student.class)
    							.addAnnotatedClass(Employee.class);
    	
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	session.beginTransaction();
    	//-----
    		//INSERT INTO student(rollno, name, address) VALUE (1, "Vinod", "Pune");

    /*	Student std1 = new Student();
    	std1.setRollno(1);
    	std1.setName("Pappu");
    	std1.setAddress("Mumbai");
    	
    	session.save(std1);
    */	
    	Student std2 = new Student(7, "Salmon", "Mumbai");
    	session.save(std2);
   	
  
    	//SELECT * FROM student WHERE rollno = 2;
    	
//    	Student dbStd =  session.get(Student.class, 2);
  //  	System.out.println("Name:- " + dbStd.getName());

    	
    	//-----
    	session.getTransaction().commit();
    	session.close();
    }
}
