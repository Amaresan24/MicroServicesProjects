package com.World.Controller;
/////  ------------------------< its is called as Pojo class ---------> 

//same like enity class  create without Annations 

public class Student {

	private int id;
	private String name;
	private int age;
	private String gender;
	private boolean isPersent;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public boolean isPersent() {
		return isPersent;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setPersent(boolean isPersent) {
		this.isPersent = isPersent;
	}

}
