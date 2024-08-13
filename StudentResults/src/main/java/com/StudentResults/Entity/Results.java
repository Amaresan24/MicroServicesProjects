package com.StudentResults.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "results_view")
@Entity
public class Results {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int rollnumber;
	private String name;
	private int totalmarks;
	private int percentage;



	public int getId() {
		return id;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public String getName() {
		return name;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
