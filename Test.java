package com.test.associations;

import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
public class Test{

	public static void main(String[] args) {
		
		EntityManagerFactory fac= Persistence.createEntityManagerFactory("JPA-PU");
		fac.close();
	}

}
