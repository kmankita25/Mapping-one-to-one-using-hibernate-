package org.example;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session= sf.openSession();
        Transaction txn;
        Scanner scn = new Scanner(System.in);
        txn = session.beginTransaction();

        Quemap st = new Quemap();
        System.out.println("enter Question");
        st.setQuestion(scn.nextLine());
        System.out.println("enter Question id");
        st.setQuestionId(scn.nextInt());

        Ansmap as = new Ansmap();
        System.out.println("Enter answer id");

        as.setAnswerId(scn.nextInt());
        scn.nextLine();
        System.out.println("Enter answer");
        as.setAns(scn.nextLine());


        session.save(st);
        session.save(as);


        txn.commit();


        session.close();
        sf.close();
    }


}
