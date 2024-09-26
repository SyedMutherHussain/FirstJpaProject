package io.Hussain.entityrelationships;
import io.Hussain.entityrelationships.StudentIdCard;
import io.Hussain.entityrelationships.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import io.Hussain.entityrelationships.Course;
public class StudentRead {

	public static void main(String[] args) {
		
	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Hussain2");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//scenario 1 (student ka rollno rakhke card no dhundne ka)
        Student s1 = entityManager.find(Student.class,1);//Assuming 1 in roll no
        if(s1 != null) {
        System.out.println(s1.getName());
        for(Course c : s1.getCourseList()) {
        	System.out.println(c.getCourseName());
        }
//        System.out.println(s1.getCard().getSoftwareVersion() +" "+ s1.getCard().getCard_no());}
//        
//        //scenario 2 (card ko dundh ke ,student ko dhudne ka)
//        else {
//		StudentIdCard c1 = entityManager.find(StudentIdCard.class,3);
//	    System.out.println(c1.getStudent().getName()+" "+c1.getCardNumber()+" "+c1.getSoftwareVersion());
		
//		Course cc1 = entityManager.find(Course.class,5);
//		System.out.print(cc1.getCourseName() + " " +cc1.getStudent().getName() );
        }
	}
}
