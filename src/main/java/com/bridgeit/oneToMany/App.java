package com.bridgeit.oneToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Brand.class)
				.addAnnotatedClass(Phone.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Brand brand = new Brand("Samsung");
	

		Phone phone1 = new Phone("S3", "Galaxy");
		Phone phone2 = new Phone("S8", "series");

		phone1.setBrand(brand);
		phone2.setBrand(brand);

		session.save(phone1);
		session.save(phone2);
//		session.save(brand);
		
		
		transaction.commit();

	}

}
