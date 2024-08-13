package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import java.util.stream.Collectors;

@RequestMapping(value = "/admin")

@RestController

public class Wep_AppCont {

	@GetMapping(value = "/get")
	public String display() {
		// return "Hello guyss";
		return "demo.html";

	}

	@GetMapping(value = "/myName/{a}")
	public String show_name(@PathVariable String a) {
		return "Hello " + a;

	}
// Add two Number in PathVariable

	@GetMapping(value = "/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

// cheack  the vowels in string
	@GetMapping(value = "/vowles/{b}")
	public String check(@PathVariable String b) {
		String s = "";
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o'
					|| b.charAt(i) == 'u') {
				s = s + b.charAt(i);
			}

		}
		return s;
	}

// print last character in given string
	@GetMapping(value = "/last/{a}")
	public char letter(@PathVariable String a) {
		char y = a.charAt(a.length() - 1);
		return y;
	}

// check in  prime Number or Not 

	@GetMapping(value = "/prime/{a}/{b}")
	public List<Integer> primeNumber(@PathVariable int a, @PathVariable int b) {
		ArrayList<Integer> sub = new ArrayList<>();
		for (int i = a; i < b; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}

			}
			if (isPrime == true) {
				sub.add(i);
			}
		}
		return sub;
	}

//// concat both strings 

	@GetMapping(value = "/concat/{a}/{b}")
	public String word(@PathVariable String a, @PathVariable String b) {
		return a.concat(b).toUpperCase();
	}

/// ----------------------------------------------------object return-------------------------

//@GetMapping(value  = "/car_details")
//public Car myCar(@RequestBody Car a) {
//return a;
//}

/// ----------------------------------------------------List object Return -------------------------
	@GetMapping(value = "/car_list")
	public List<Car> myCar(@RequestBody List<Car> cars) {

		// ArrayList<Car> av = new ArrayList <>(a);
		// return av;

		List<Car> maxPrice = cars.stream().sorted(Comparator.comparing(Car::getPrice).reversed()).limit(1)
				.collect(Collectors.toList());
		return maxPrice;

	}
//// ---------------------------using the @Request Param Annatations --------------->

	@GetMapping(value = "/param")
	public String req_peram(@RequestParam String name) {
		return "Hello, " + name + "!";
	}

	public String get_junit() {
		return "Amaresh";
	}

/// ------------>     scope Bean -------------> /////

}

class Car {
	private String brand;
	private String model;
	private int price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
