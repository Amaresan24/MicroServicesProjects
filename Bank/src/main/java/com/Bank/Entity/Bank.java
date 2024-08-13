package com.Bank.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "bank_details")
@Entity


public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bankname;
	private String ifsc_code;
	private String branch;

	public int getId() {
		return id;
	}

	public String getBankname() {
		return bankname;
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

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
