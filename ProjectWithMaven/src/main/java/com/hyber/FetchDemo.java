package com.hyber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
      public static void main(String[] args) {
		//get , load
          SessionFactory factory=new Configuration().configure().buildSessionFactory();
          Session session= factory.openSession();
          //get-student:107
          Student student=(Student)session.getReference(Student.class,107);
         // System.out.println(student.getName());
          
        // Address ad=(Address) session.get(Address.class, 1);
         /// System.out.println(ad);
          
          
          session.close();
          factory.close();
          
    	  
    	  
	}

}
