package io.Hussain;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
public class PokedexinitiatorCreate {

		public static void main(String[] args) {
		Pokemon p1 = new Pokemon();
		p1.setName("pikachu");
		p1.setPower(100);
		p1.setType("electrical");
		p1.setColor(Color.YELLOW);
		
		Pokemon p2 = new Pokemon();
		p2.setName("charizard");
		p2.setPower(200);
		p2.setType("fire");
		p2.setColor(Color.ORANGE);
		
		Pokemon p3= new Pokemon();
		p3.setName("Meowth");
		p3.setPower(80);
		p3.setType("cat");
		p3.setColor(Color.CREAM);
	
		
				
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hussain");//isme persistence unit ka naam
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();//trasaction shuru hui
		entityManager.persist(p1);//p1 paisa store hua 
		entityManager.persist(p2);//p2 paisa store hua 
		entityManager.persist(p3);//p3 paisa store hua 
		entityTransaction.commit();//transaction band hui
		
		
		
		
		
	}
}

//Step-1 

//EntityManagerFactory  ---> Jpa ke andaar ek interface hai 
//---> usko implement kiya gaya ha persistence naam ki ek class sae --> aur voh class static ha --> aur uske  andar ek function ha createEntityManagerFactory
//-->ho persistence unit ka naam lekar tumhe EntityManager Factory create karkr dedeta ha

//Step-2 
//EntityManager entityManager = entityManagerFactory.createEntityManager();
//abh EntityManagerFactory sae entity manager create kar lete ha  

//Step-3
//Relational object ke andhar jo bhi CRUD Operation create karte ha usse hum Transaction kehte hai
