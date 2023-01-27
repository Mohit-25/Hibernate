package com.cascade;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.map1.Answers;
import com.map1.Question1;
import com.sun.tools.javac.util.List;

public class CascadeExample {
	public static void main(String[] args) {
		
		SessionFactory f=new Configuration().configure().buildSessionFactory();
		
		Session s=f.openSession();
		
		Question1 q1=new Question1();
		q1.setQuestionId(125);
		q1.setQuestion("What is swing framework");
		Answers a1=new Answers(127,"Use for development",q1);
		Answers a2=new Answers(128,"Desktop",q1);
		Answers a3=new Answers(129,"learn by programmers",q1);
		ArrayList<Answers> list=new ArrayList<Answers>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		q1.setAnswer(list);
		
		s.beginTransaction();
		s.persist(q1);
		
		s.getTransaction().commit();
		
		s.close();
		f.close();
	}

}
