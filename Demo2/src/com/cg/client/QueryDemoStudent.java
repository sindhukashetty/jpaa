package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QueryDemoStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
	    manager.getTransaction().begin();
	
	String qry = "SELECT entity FROM  StudentEntity entity WHERE entity.percentage>=95 and entity.percentage<=97";
	Query query = manager.createQuery(qry);
	List list = query.getResultList();
	
	for(Object object :list)
	{
	System.out.println(object);		
	}
	manager.getTransaction().commit();
	manager.close();
	}

}
