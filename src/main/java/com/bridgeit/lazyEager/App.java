package com.bridgeit.lazyEager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgeit.MappingRelation.Laptop;
import com.bridgeit.MappingRelation.Student;

public class App {
	public static void main(String[] args) {
		Student student=new Student();
		Laptop laptop=new Laptop();
		
		student.setsId(1);
		student.setsName("faisal");
		laptop.setlId(102);
		laptop.setlName("HP");
		student.getLaptop().add(laptop);

		
Configuration configuration=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
SessionFactory factory=configuration.buildSessionFactory();
Session session=factory.openSession();
Transaction transaction=session.beginTransaction();
session.save(student);

transaction.commit();

	}
}
