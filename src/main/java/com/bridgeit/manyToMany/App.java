package com.bridgeit.manyToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.manyToOne.Address;
import com.bridgeit.manyToOne.Employee;

public class App {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Books.class)
				.addAnnotatedClass(Teacher.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
	
		Set<Books> book=new HashSet<>();
		book.add(new Books("Spring"));
		book.add(new Books("Hibernate"));
		
		Teacher teacher=new Teacher("khan", book);
		Teacher teacher2=new Teacher("Ansari", book);
		
		session.save(teacher);
		session.save(teacher2);
		
		transaction.commit();
	
		
	
		
	
		
	}

}
