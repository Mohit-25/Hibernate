package com.map1;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.bytecode.spi.ReflectionOptimizer.AccessOptimizer;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.jdbc.UnsupportedDataSourcePropertyException;

import com.map.Question;

public class Map1Demo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		/*Question1 q1 = new Question1();
		q1.setQuestionId(101);
		q1.setQuestion("what is java");

		Question1 q2 = new Question1();
		q2.setQuestionId(102);
		q2.setQuestion("what is python");

		Answers ans1 = new Answers();
		ans1.setAnswerId(1001);
		ans1.setAnswer("Java is a programming language");
		ans1.setQuestion(q1);

		Answers ans2 = new Answers();
		ans2.setAnswerId(1002);
		ans2.setAnswer("Java is used to build website");
		ans2.setQuestion(q1);

		ArrayList<Answers> answers = new ArrayList<Answers>();
		answers.add(ans1);
		answers.add(ans2);
		q1.setAnswer(answers);

		Answers ans3 = new Answers();
		ans3.setAnswerId(1003);
		ans3.setAnswer("Python is a programming language");
		ans3.setQuestion(q2);

		Answers ans4 = new Answers();
		ans4.setAnswerId(1004);
		ans4.setAnswer("It provides library for machine learning");
		ans4.setQuestion(q2);

		Answers ans5 = new Answers();
		ans5.setAnswerId(1005);
		ans5.setAnswer("Django is used for build website");
		ans5.setQuestion(q2);

		ArrayList<Answers> answers2 = new ArrayList<Answers>();
		answers2.add(ans3);
		answers2.add(ans4);
		answers2.add(ans5);
		q2.setAnswer(answers2);*/

		Session session = factory.openSession();

		/*session.beginTransaction();
		session.persist(q1);
		session.persist(q2);
		session.persist(ans1);
		session.persist(ans2);
		session.persist(ans3);
		session.persist(ans4);
		session.persist(ans5);
		session.getTransaction().commit();*/

		Question1 q = (Question1) session.get(Question1.class, 101);
		/*System.out.println(q.getQuestionId());
		System.out.println(q.getQuestion());
		//Lazy
		System.out.println(q.getAnswer().size());*/
		
		
		System.out.println(q.getQuestion());
		for (Answers a : q.getAnswer()) {
			System.out.println(a.getAnswer());
		}

		factory.close();
		session.close();

	}

}
