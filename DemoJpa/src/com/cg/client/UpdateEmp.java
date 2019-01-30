package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.Employee;

public class UpdateEmp {

	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Employee employee = manager.find(Employee.class, 1);
		System.out.println("Original Object: "+employee);
		employee.setEmpSal(employee.getEmpSal()+2000);
		manager.merge(employee);
		manager.getTransaction().commit();
		manager.close();
		System.out.println("updated");
		factory.close();
		
	}

}
