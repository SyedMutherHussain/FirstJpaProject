package io.Hussain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence; 

public class PokedexinitiatorRead {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hussain");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Pokemon p = entityManager.find(Pokemon.class,"pikachu");
		
		System.out.println(p);
	}
}
