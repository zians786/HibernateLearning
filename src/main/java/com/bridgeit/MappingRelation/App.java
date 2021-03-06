package com.bridgeit.MappingRelation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

                                      
		Student student=new Student();   //One To One
		Laptop laptop=new Laptop();
		student.setsId(1);
		student.setsName("faisal");

		laptop.setlId(101);
		laptop.setlName("Dell");
		student.setLaptop(laptop);

		Configuration configuration=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();

		session.save(student);
		session.save(laptop);
		transaction.commit();

		
		
		//Student student=new Student();   //Creation....
		//Laptop laptop=new Laptop();
		//student.setsId(1);
		//student.setsName("faisal");
		//
		//laptop.setlId(101);
		//laptop.setlName("Dell");

		
		
//		Student student=new Student();   //One to Many
//		Laptop laptop=new Laptop();
//		student.setsId(1);
//		student.setsName("faisal");
//
//		laptop.setlId(101);
//		laptop.setlName("Dell");
//		student.getLaptop().add(laptop);
		
		
//		Student student=new Student();   //Many to One
//		Laptop laptop=new Laptop();
//		student.setsId(1);
//		student.setsName("faisal");
//
//		laptop.setlId(101);
//		laptop.setlName("Dell");
//		student.getLaptop().add(laptop);
		
//		Student student=new Student();   //Many to Many
//		Laptop laptop=new Laptop();
//		student.setsId(3);
//		student.setsName("zian");
//
//		laptop.setlId(102);
//		laptop.setlName("HP");
//		student.getLaptop().add(laptop);
		
		


		

	}

}
