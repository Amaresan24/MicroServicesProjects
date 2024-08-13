package com.NetPrice;

public class Product {
	private int id;
	private String name;
	private int quantity;
	private int price;
	private int hsnCode;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public int getHsnCode() {
		return hsnCode;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setHsnCode(int hsnCode) {
		this.hsnCode = hsnCode;
	}
}
