package com.example.electronics.enity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; /// package for that Table KeyWord

@Table(name = "tv_details") //// -----> it is creating for in database_ name ---->
@Entity
public class TV {

	@Id // is called as primary key -------->
	@GeneratedValue(strategy = GenerationType.IDENTITY) // its is called as to help conf the ids in automatic one by one
	private int id;
	private String brand;
	private String model;
	private boolean isLead;
	private int price;

	public int getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public boolean getisLead() {
		return isLead;
	}

	public int getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setisLead(boolean isLead) {
		this.isLead = isLead;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
