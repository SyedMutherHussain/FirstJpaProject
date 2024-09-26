package io.Hussain.entityrelationships;

import javax.persistence.Column;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	@Column(name = "student_name",nullable = false)//column ko naam de rahe haa aur student ka name null nahi ho sakte isliye hum usse false kar rahe ha 
	
	private String name;
	
	
	@Id  //->because of primary key we use this notation
	@GeneratedValue(strategy = GenerationType.AUTO) //yeh automatically values ko generate karne ke liye annotation ha 
	private int roll_no;
	
	@OneToOne(fetch = FetchType.LAZY)//--->foreign key and primary key wala concept
	//one - one 1).fetch time EAGER,LAZY    // student ko studentId card ke saath onetoone mapping karwa rahe ha
	private StudentIdCard card;//`Student` class ka `StudentIdCard` object
	
	// Student ke courses (one-to-many relationship)

	@OneToMany(mappedBy = "student")
	 // Getters and Setters
	private List<Course> courseList;
	
	public List<Course> getCourseList(){
		return courseList;
	}
	
	//object type ka haa StudentIdcard kaa
	public StudentIdCard getCard() {
		return card;
	}

	public void setCard(StudentIdCard card) {
		this.card = card;
	}


	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	
	
}
