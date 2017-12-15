package com.bridgeit.todo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure().addAnnotatedClass(TODOUser.class)
				.addAnnotatedClass(TODONotes.class).addAnnotatedClass(TODOLabel.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		
		System.out.println("working");
		Transaction transaction = session.beginTransaction();
		
		TODOLabel label= session.get(TODOLabel.class, 3);
		TODONotes notes=session.get(TODONotes.class,1);
		List list=new ArrayList<>();
		list.add(label);
		notes.setLabel(list);
	/*	
		TODOUser todoUser=new TODOUser();
		todoUser.setUserName("Ansari");
		
		List<TODOLabel> list=new ArrayList<TODOLabel>();
		
		
		TODOLabel label= new TODOLabel();
		label.setName("Shopping");
		
		TODOLabel label2=new TODOLabel();
		label2.setName("Driving");
		list.add(label);
		list.add(label2);
		
		TODONotes notes=new TODONotes();
		notes.setUser(todoUser);
		notes.setTitle("Hello");
		notes.setLabel(list);
	
		session.save(notes);
		*/
		session.update(notes);
		transaction.commit();
	
}
}