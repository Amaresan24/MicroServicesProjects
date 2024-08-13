package com.Customer.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "customer_detail")
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int account_number;
	private String ifsc_code;
	private String branch;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAccount_number() {
		return account_number;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public String getBranch() {
		return branch;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
