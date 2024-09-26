package io.Hussain.entityrelationships;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentIdCard {

	@Id//primary key of our course 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int card_no;// Card ka unique ID
	
	private String softwareVersion; // Card ka software version
 
	@OneToOne //student aur studentId card ko one-to-one mapping karva rahe ha
	private Student student; // Student jiske paas yeh card hai,// `StudentIdCard` class ka `Student` object

	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getCard_no() {
		return card_no;
	}

	public void setCard_no(int card_no) {
		this.card_no = card_no;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	public String getCardNumber() {
		// TODO Auto-generated method stub
		return null;
	}
}
