package com.Transctional.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="recive_table")
@Entity
public class Recevier_Entity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	private String name;
	private  int recevier_amount;
	private int recevier_totalamount;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getRecevier_amount() {
		return recevier_amount;
	}

	public int getRecevier_totalamount() {
		return recevier_totalamount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRecevier_amount(int recevier_amount) {
		this.recevier_amount = recevier_amount;
	}

	public void setRecevier_totalamount(int recevier_totalamount) {
		this.recevier_totalamount = recevier_totalamount;
	}
}
