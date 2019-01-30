package com.cg.client;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entity.Employee;

public class DynamicQueryDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
	   
		manager.getTransaction().begin();
     String qry =  "Select emp FROM Employee emp WHERE emp.empId=:id";
     TypedQuery<Employee> query = manager.createQuery(qry, Employee.class);
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter id to search::");
     int eid = scanner.nextInt();
     
     query.setParameter("id", eid);
     Employee emp = query.getSingleResult();
     System.out.println(emp.getEmpSal()+" "+emp.getEmpName());
     
     manager.getTransaction().commit();
     manager.close();
     factory.close();
     scanner.close();
		
	}

}
