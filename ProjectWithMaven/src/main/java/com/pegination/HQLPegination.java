package com.pegination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hyber.Student;


public class HQLPegination {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		
		Session session=factory.openSession();
		Query q=session.createQuery("from Student");
		
		//implementing pegination using hibernate
		
		q.setFirstResult(0);
		q.setMaxResults(5);
		
		List<Student> list=q.list();
		for(Student s:list)
		{
			System.out.println(s.getId()+":"+
		s.getName()+":"+ s.getCity());
		}
		
		session.close();
		factory.close();
	}
}
