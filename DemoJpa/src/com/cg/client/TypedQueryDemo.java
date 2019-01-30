package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entity.Employee;

public class TypedQueryDemo {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		String query = "SELECT emp FROM Employee emp WHERE emp.empSal>=30000 AND emp.empSal<=40000";

		TypedQuery<Employee> query2 = manager
				.createQuery(query, Employee.class);

		List list = query2.getResultList();
		for (Object object : list) {
			System.out.println(object);

		}
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
