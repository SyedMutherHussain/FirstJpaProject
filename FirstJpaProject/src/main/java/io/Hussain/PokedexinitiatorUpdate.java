package io.Hussain;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityTransaction;

public class PokedexinitiatorUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hussain");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Pokemon p = entityManager.find(Pokemon.class,"pikachu");
		
		if(p !=null) {  //check kar p null nahi hai na baad mae usme 200 value update karte pikachu ke box mae
			p.setPower(200);
			
			entityTransaction.begin();
			entityManager.persist(p);
			entityTransaction.commit();
		}
	}
}
