package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.hyber.Student;



public class SQLExample {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session s=factory.openSession();
		
		//SQL Query
		String q="select * from Student";
		NativeQuery nq=s.createNativeQuery(q);
		List<Object[]> list= nq.list(); //Student is table so we use Object instead of Student type
		for(Object[] s1:list)
		{
			System.out.println(Arrays.toString(s1));
			System.out.println(s1[4]+":"+s1[3]);
		}
		
		s.close();
		factory.close();
	}
}
