package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entity.Person;

public class NamedQueryDemo {

	public static void main(String[] args) {

		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		TypedQuery<Person> qry = manager.createNamedQuery("getAll",Person.class);
		List<Person> list = qry.getResultList();
		
		for (Person person : list) {
			System.out.println(person);
		}
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
