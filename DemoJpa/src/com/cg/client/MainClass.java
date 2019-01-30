package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Employee;

public class MainClass {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		Employee emp = new Employee();
		emp.setEmpName("sri");
		emp.setEmpSal(30000);

		manager.persist(emp);

		Employee emp1 = new Employee();
		emp1.setEmpName("haseena");
		emp1.setEmpSal(45000);

		manager.persist(emp1);
		manager.getTransaction().commit();
		manager.close();
		System.out.println("Added Employee");

		factory.close();

	}

}
