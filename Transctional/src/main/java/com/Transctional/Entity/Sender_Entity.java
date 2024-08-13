package com.Transctional.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "sender_table")
@Entity
public class Sender_Entity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int send_amount;
	private int total_amount;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSend_amount() {
		return send_amount;
	}

	public int getTotal_amount() {
		return total_amount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSend_amount(int send_amount) {
		this.send_amount = send_amount;
	}

	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}

}
