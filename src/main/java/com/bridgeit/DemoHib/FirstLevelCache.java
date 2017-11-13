package com.bridgeit.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstLevelCache {

	public static void main(String[] args) {
		 User user=null;
		 Configuration configuration=new Configuration().configure().addAnnotatedClass(User.class);
		 SessionFactory factory=configuration.buildSessionFactory();

//First level Cache		 
//		 Session session=factory.openSession();
//		 Transaction transaction=session.beginTransaction();
//		 user=(User)session.get(User.class, 1);
//		 System.out.println(user);
//		 user=(User)session.get(User.class, 1);
//		 System.out.println(user);
		
//		 transaction.commit();
		 
		 
		 Session session=factory.openSession();
		 Transaction transaction=session.beginTransaction();

		 user=(User)session.get(User.class, 1);
		 System.out.println(user);
			
		 transaction.commit();
		 Session session1=factory.openSession();
		 Transaction transaction1=session1.beginTransaction();

		 user=(User)session1.get(User.class, 1);
		 System.out.println(user);
		 transaction1.commit();
		 
	}

}