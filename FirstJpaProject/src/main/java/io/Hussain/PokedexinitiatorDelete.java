package io.Hussain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexinitiatorDelete {
   
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hussain");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Pokemon p = entityManager.find(Pokemon.class,"pikachu");
		
		if(p != null) {//This checks if the entity was found in the database. If p is not null, it means the entity exists.
			
		entityTransaction.begin();
		entityManager.remove(p);
		entityTransaction.commit();
		}else {
			System.out.println("does not exists");
		}
		
	}
}
