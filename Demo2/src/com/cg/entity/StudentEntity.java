package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "StudentJEE")
@NamedQueries({@NamedQuery(name="getAllStuds",query="Select entity from StudentEntity entity ")})
public class StudentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@SequenceGenerator(name="sequence_id",initialValue=100,allocationSize=1)
	private int StudentId;
	private String StudName;
	private String Stream;
	@Transient
    private int percentage;
	public StudentEntity() {

	}

	

	@Override
	public String toString() {
		return "StudentEntity [StudentId=" + StudentId + ", StudName="
				+ StudName + ", Stream=" + Stream + ", percentage="
				+ percentage + "]";
	}



	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getStudName() {
		return StudName;
	}

	public void setStudName(String studName) {
		StudName = studName;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
}


