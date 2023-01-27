package com.map2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Map2Demo {
	
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Emp e1=new Emp();
		e1.setEid(101);
		e1.setName("Mohit");
		
		
		
		
		Emp e2=new Emp();
		e2.setEid(102);
		e2.setName("Vasu");
		
		Project p1=new Project();
		p1.setPid(1001);
		p1.setProjectName("Pyhton project");
		
		
		
		Project p2=new Project();
		p2.setPid(1002);
		p2.setProjectName("Java project");
		
		List<Emp> emps=new ArrayList<Emp>();
		emps.add(e1);
		emps.add(e2);
		p2.setEmps(emps);
		
		List<Project> projects=new ArrayList<Project>();
		projects.add(p1);
		projects.add(p2);
		e1.setProjects(projects);
		
		
		Session session=factory.openSession();
		session.beginTransaction(); 
		
		session.persist(e1);
		session.persist(e2);
		session.persist(p1);
		session.persist(p2);
		
		session.getTransaction().commit();		
		session.close();
		factory.close();
	}

}
