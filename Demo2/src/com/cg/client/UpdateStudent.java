package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.StudentEntity;

public class UpdateStudent {

	public static void main(String[] args) {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		StudentEntity entity = manager.find(StudentEntity.class, 2);
		System.out.println("created entity : "+entity);
		entity.setPercentage(entity.getPercentage()-2);
		manager.merge(entity);
		
		manager.getTransaction().commit();
		System.out.println("student percentage updated");
		manager.close();
		factory.close();
		
	}

}
