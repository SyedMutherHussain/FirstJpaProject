package io.Hussain.entityrelationships;

import javax.persistence.EntityTransaction;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
public class StudentCreate {

	private static final String Entitytransaction  = null;

	public static void main(String[] args) {
	Student s1 = new Student();
	s1.setName("Karthik");
	
	Student s2 = new Student();
	s2.setName("Swapnil");
	
	// Create StudentIdCard objects
	StudentIdCard C1 = new StudentIdCard();
	C1.setSoftwareVersion("1.0.1");
    C1.setStudent(s1);
	
	StudentIdCard C2 = new StudentIdCard();
	C2.setSoftwareVersion("1.0.2");
	C2.setStudent(s2);
	
	// Link StudentIdCards to Students
	s1.setCard(C1); 
	s2.setCard(C2);
	
	// Create Course objects
	Course cc1 = new Course();
	cc1.setCourseName("Prog");
	
	Course cc2 = new Course();
	cc2.setCourseName("DbMS");
	
	cc1.setStudent(s1);
	cc2.setStudent(s1);
	
	//Initilalize and set courseList
	 s1.setCourseList(new ArrayList<>(List.of(cc1, cc2)));
     s2.setCourseList(new ArrayList<>(List.of(cc1))); // cc1 is shared between s1 and s2
     
     // abh humko entity ko manage karna ha uske liye hume EntityManagerFactory use hoga

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hussain2");
	EntityManager entityManager = entityManagerFactory.createEntityManager();                  //---->this 2 things are needed for crud operation
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(s1);
	entityManager.persist(s2);
	entityManager.persist(C1);
	entityManager.persist(C2);
	entityManager.persist(cc1);
	entityManager.persist(cc2);
	entityTransaction.commit();
	
	}}
