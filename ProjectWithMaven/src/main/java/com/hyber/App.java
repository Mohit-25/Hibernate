package com.hyber;

import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;
import java.util.Date;

import javax.imageio.stream.FileImageInputStream;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
      
        //creating student
        Student st=new Student();
        st.setId(4);
        st.setName("mansi");
        st.setCity("a'bad");
        System.out.println(st);
        
        //creating object of address class
        Address ad=new Address();
        ad.setStreet("nikol street");
        ad.setCity("karnavati nagar");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(11.26);
        
        //reading image
        FileInputStream fis=new FileInputStream("src/main/java/download.jpg");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
         
        
        
        Session session= factory.openSession();
        
        session.beginTransaction();
        session.persist(st);
        session.persist(ad);
        session.getTransaction().commit();        
        
        session.close();
        System.out.println("Done");
        
    }
} 
