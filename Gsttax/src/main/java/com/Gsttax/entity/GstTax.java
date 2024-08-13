package com.Gsttax.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Gst_items")
@Entity
public class GstTax {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int hsn_code;
	private int percentage;

	public int getId() {
		return id;
	}

	public int gethsn_code() {
		return hsn_code;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void sethsn_code(int hsn_code) {
		this.hsn_code = hsn_code;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
