package com.bridgeit.manyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Address.class);
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Address address = new Address("Govandi");
		session.save(address);

		Employee employee = new Employee("Imran");
		Employee employee2 = new Employee("khan");

		employee.setAddress(address);
		employee2.setAddress(address);

		session.save(employee);
		session.save(employee2);

		transaction.commit();

	}

}
