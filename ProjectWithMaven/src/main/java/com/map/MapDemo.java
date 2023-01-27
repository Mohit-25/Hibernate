package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {

		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory =  cfg.buildSessionFactory();
//		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		// creating question
		Question q1 = new Question();
		q1.setQuestionId(101);
		q1.setQuestion("What is java");

		// creating answer
		Answer ans1 = new Answer();
		ans1.setAnswerId(1001);
		ans1.setAnswer("Java is programming language");
		ans1.setQuestion(q1);
		q1.setAnswer(ans1);
		

		// creating question
		Question q2 = new Question();
		q2.setQuestionId(102);
		q2.setQuestion("What is collection framework");

		// creating answer
		Answer ans2 = new Answer();
		ans2.setAnswerId(1002);
		ans2.setAnswer("API to work with objects in java");
		ans2.setQuestion(q2);
		q2.setAnswer(ans2);

		// session

		Session session = factory.openSession();
		session.beginTransaction();
		// save
		session.persist(q1);
		session.persist(ans1);
		session.persist(q2);
		session.persist(ans2);
		session.getTransaction().commit();
		
		//fetching...
		Question newq= (Question)session.get(Question.class, 101);
		System.out.println(newq.getQuestion());
		System.out.println(newq.getAnswer().getAnswer());
		
		session.close();
		factory.close();

	}

}
