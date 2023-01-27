package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hyber.Student;


public class FirstDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session s=factory.openSession();
		//by default enabled
		
		Student s1=s.get(Student.class,107); //query fired
		System.out.println(s1);
		
		System.out.println("Working something...");
		
		Student s2=s.get(Student.class,107); //query not fired
		System.out.println(s2);
		
		System.out.println(s.contains(s1)); //true
		
		
		s.close();
		factory.close();
	}
}
