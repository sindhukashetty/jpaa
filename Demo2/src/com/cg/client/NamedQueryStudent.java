package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entity.StudentEntity;

public class NamedQueryStudent {

	public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager manager = factory.createEntityManager();
	manager.getTransaction().begin();
	
	TypedQuery<StudentEntity> query = manager.createNamedQuery("getAllStuds",StudentEntity.class);
	List list = query.getResultList();
	
	for (Object object : list) {
		System.out.println(object);
	}
	
	manager.getTransaction().commit();
	manager.close();
	factory.close();

	}

}
