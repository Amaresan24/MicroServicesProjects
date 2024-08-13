package com.StudentDetails.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Table(name = "student")
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	@Transient
	private String name;

	private int rollnumber;
	private String gender;
	private int age;
	private String course;
	private int attendance;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getCourse() {
		return course;
	}

	public int isAttendance() {
		return attendance;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

}
