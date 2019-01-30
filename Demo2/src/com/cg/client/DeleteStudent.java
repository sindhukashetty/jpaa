package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.StudentEntity;

public class DeleteStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		StudentEntity entity = manager.find(StudentEntity.class,2);
				manager.remove(entity);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		
	}

}
