package com.hyber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate5.support.OpenSessionInterceptor;

public class EmDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		/*Student student1=new Student();
		student1.setId(1001);
		student1.setName("Mohit Dobariya");
		student1.setCity("Rajkot");
		
		Certificate certificate1= new Certificate();
		certificate1.setCourse("Java course");
		certificate1.SetDuration("3 months");
		student1.setCerti(certificate1);
		
		Student student2=new Student();
		student2.setId(1002);
		student2.setName("vasu mak");
		student2.setCity("torronto");
		
		Certificate certificate2= new Certificate();
		certificate2.setCourse("python course");
		certificate2.SetDuration("4 months");
		student2.setCerti(certificate2);
		
        Student student3=new Student(1003,"Piyush","mumbai");
        student3.setCerti(new Certificate("python course","5 months"));*/
		
		Session session= factory.openSession();
		
		/*session.beginTransaction();
		session.persist(student1);
		session.persist(student2);
		session.persist(student3);
		session.getTransaction().commit();*/
		
		
		
		session.close();
		factory.close();
	}
}
