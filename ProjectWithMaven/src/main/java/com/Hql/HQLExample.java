package com.Hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import com.hyber.Student;


public class HQLExample {
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		
		//HQL
		//Syntax:
		//select data
		/*String query="from Student as s where s.city=:c and s.name=:d" ;
		Query q=s.createQuery(query);
		q.setParameter("c", "mumbai");
		q.setParameter("d","Piyush");
		//single - Unique
		//multiple - List
		List<Student> list =q.list();
		for(Student s1:list)
		{   
			System.out.println(s1.getName()+":"+ s1.getCerti().getCourse());		
		}*/
		
		
		System.out.println("____________________________________");
		
		s.beginTransaction();
		
		//update
		/*Query q2=s.createQuery("update Student set name='mohit' where city='Rajkot'");
		q2.executeUpdate();*/
		
		
		
		//delete 
		/*Query q1=s.createQuery("delete from Student where city=:c");
		q1.setParameter("c", "torronto");
		
		int r=q1.executeUpdate();
		System.out.println("deleted"+ r);*/
		
		s.getTransaction().commit();
		
		//execute join query from map1
		Query q3=s.createQuery("select q.question, q.questionId, a.answer from Question1 as q INNER JOIN q.answer as a" );
		List <Object []> list3=q3.getResultList();              //answer field of Answer class           //class of answer field in Question class
		for(Object[] arr:list3)
		{
			System.out.println(Arrays.toString(arr));
		}
		
		s.close();
		factory.close();
		
	}
	

}
