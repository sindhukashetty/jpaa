package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entity.StudentEntity;

public class TypedQueryStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		String query = "SELECT entity FROM StudentEntity entity WHERE entity.percentage>=95 AND entity.percentage<=97";
		TypedQuery<StudentEntity> query2  = manager.createQuery(query,StudentEntity.class);


		List list = query2.getResultList();
		for (Object object : list) {
			System.out.println(object);
		}
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}

}
