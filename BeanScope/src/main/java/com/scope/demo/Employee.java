package com.scope.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	@Value("firstEmployee")
	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		System.out.println("object created");

	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

}
