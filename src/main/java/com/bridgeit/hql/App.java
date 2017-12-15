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
		
		Query query=session.createQuery("select name from Employee where id=21");
		String name=(String) query.uniqueResult();
	
			System.out.print(name);

			
//		Query query=session.createQuery("select name,salary from Employee");
//		List<Object[]> employe=(List<Object[]>) query.list();
//		
//	for(Object[] emp:employe) {
//			System.out.println(emp[0]+" : "+emp[1]);
//	}
//	
//	query=session.createQuery("delete from Employee where id=19");
//	int i=query.executeUpdate();
//	if(i>0) {
//		System.out.println("id = 19 deleted...");
//	}
//	
//	 query=session.createQuery("select name,salary from Employee");
//	List<Object[]> employee=(List<Object[]>) query.list();
//	
//for(Object[] emp:employee) {
//		System.out.println(emp[0]+" : "+emp[1]);
//}
		transaction.commit();
		
		
	}

}
