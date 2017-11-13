package com.bridgeit.hql;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		Configuration configuration=new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Random random=new Random();
		Transaction transaction=session.beginTransaction();
		
//		for(int i=0;i<20;i++) {
//			Employee employee=new Employee();
//			employee.setId(i);
//			employee.setName("name"+i);
//			employee.setSalary(random.nextInt(40000));
//			session.save(employee);
//		}

//		Query query=session.createQuery("from Employee where id=19 or name='name1'");
//		List<Employee> employees=query.list();
//		
//		for(Employee employee:employees) {
//		System.out.println(employee);
//		}
		
//		Query query=session.createQuery("select name,salary from Employee where id=7");
//		Object[] employe=(Object[]) query.uniqueResult();
//	
//			System.out.print(employe[0]+" "+employe[1]);
//
			
		Query query=session.createQuery("select name,salary from Employee");
		List<Object[]> employe=(List<Object[]>) query.list();
		
	for(Object[] emp:employe) {
			System.out.println(emp[0]+" : "+emp[1]);
	}
			
		transaction.commit();
		

	}

}
