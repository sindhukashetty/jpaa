package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entity.StudentEntity;

public class MainClass {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		StudentEntity entity = new StudentEntity();
		entity.setStudName("Sanju");
		entity.setStream("Electrical");
		entity.setPercentage(95);
		System.out.println("Student record is inserted");

		manager.persist(entity);

		StudentEntity entity1 = new StudentEntity();
		entity1.setStudName("Sunny");
		entity1.setStream("computers");
		entity1.setPercentage(98);
		System.out.println("Student record is inserted");

		manager.persist(entity1);

		StudentEntity entity2 = new StudentEntity();
		entity2.setStudName("Saanvi");
		entity2.setStream("mechanics");
		entity2.setPercentage(88);
		System.out.println("Student record is inserted");

		manager.persist(entity2);

		StudentEntity entity3 = new StudentEntity();
		entity3.setStudName("Shanthi");
		entity3.setStream("civil");
		entity3.setPercentage(100);
		System.out.println("Student record is inserted");

		manager.persist(entity3);

		manager.getTransaction().commit();
		manager.close();
		factory.close();

	}

}
