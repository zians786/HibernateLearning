package com.bridgeit.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello !");

//		 User user=new User();  //Storing Object to db
//		 user.setId(1);
//		 user.setName("faisal");
//		 user.setEmail("khan@gmail.com");
//		 user.setAddress("govandi");
//
//		Configuration config = new Configuration().configure().addAnnotatedClass(User.class);
//		SessionFactory sessionFactory = config.buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		session.save(user);
//		// user=(User)session.get(User.class, 1);
//		// System.out.println(user);
//		transaction.commit();

//		User user=null;           //Fetching from db  
//		
//		Configuration config = new Configuration().configure().addAnnotatedClass(User.class);
//		SessionFactory sessionFactory = config.buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		Transaction transaction = session.beginTransaction();
//		user=(User)session.get(User.class, 1);
//		System.out.println(user);
//		transaction.commit();
//		

		
//		
//		FullName name=new FullName(); 
//		name.setFname("ansari");
//		name.setLname("azimuddin");
//		name.setMname("ziauddin");
//
//		 UserEmbeddableExample user=new UserEmbeddableExample();  //Storing Object to db
//		 user.setId(1);
//		 user.setName(name);
//		 user.setEmail("khan@gmail.com");
//		 
//		 Configuration configuration=new Configuration().configure().addAnnotatedClass(UserEmbeddableExample.class);
//		 SessionFactory factory=configuration.buildSessionFactory();
//		 Session session=factory.openSession();
//		 Transaction transaction=session.beginTransaction();
//		 session.save(user);
//		 transaction.commit();
	}
}
