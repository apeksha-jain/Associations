package com.test.associations;

import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager  = factory.createEntityManager();
		entityManager.getTransaction().begin();
		Student student = new Student();
		student.setStudentName("Test1");
		student.setStudentId(2);
		
		Address address = new Address();
		address.setAddressId(2);
		address.setAddressStreet("aecs");
		address.setAddressCity("bangalore");
		
		student.setAddress(address);
		System.out.println(student.getAddress());
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}

}
