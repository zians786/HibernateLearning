package com.bridgeit.lazyEager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Laptop.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Student student=new Student("Ansari");
//		
//		Laptop laptop=new Laptop("Acer");
//		Laptop laptop2=new Laptop("Mac");
//			
//		laptop.setStudent(student);
//		laptop2.setStudent(student);
//		session.save(student);
//		session.save(laptop);
//		session.save(laptop2);
//		transaction.commit();
		
	    Student student=null;
		
		student=session.get(Student.class,1);
		String name=student.getName();
		System.out.println(name);
		
//		Collection<Laptop> laps=student.getLaptop();
//		for(Laptop l:laps) {
//			System.out.println(l);
//		}
//		
		transaction.commit();
		

	}
}
