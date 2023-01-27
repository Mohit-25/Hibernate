package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hyber.Certificate;
import com.hyber.Student;

public class StateDemo {
	
	public static void main(String[] args) {
		
		//practical of hibernet object states:
		//Transient
		//Persistent
		//Detached
		//Removed
		System.out.println("Example:");
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		//creating student object
		Student student=new Student();
		student.setId(107);
		student.setName("Ahneer");
		student.setCity("Mumbai");
		student.setCerti(new Certificate("Java Hibernate Course", "2 Month"));
		//student : Transient
		
		Session session=factory.openSession();
		session.beginTransaction();
		session.persist(student);
		//student : Persistent - session,database
		student.setName("Grover");
		//session.remove(student);
		//student : removed - session
		
		session.getTransaction().commit();
		
		session.close();
		//student : Detached - database
		student.setName("Mohit"); //it fires query but not change in db table
		
		System.out.println(student);
		
		factory.close();
	}

}
