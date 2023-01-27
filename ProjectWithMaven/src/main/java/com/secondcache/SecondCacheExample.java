package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hyber.Student;





public class SecondCacheExample {
	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session1 = f.openSession();
		// first
		Student s1 = session1.get(Student.class, 107); // query fired
		System.out.println(s1);

		session1.close();

		Session session2 = f.openSession();
		// second
		Student s2 = session2.get(Student.class, 107); // query fired
		System.out.println(s2);
		session2.close();
		f.close();

	}

}
