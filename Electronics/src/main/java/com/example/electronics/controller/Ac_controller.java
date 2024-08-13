package com.example.electronics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.electronics.enity.AC;
import com.example.electronics.service.Ac_service;

@RequestMapping(value = "/ac")
@RestController /// controller the whole application in transfare in data .
public class Ac_controller {

	@Autowired
	Ac_service as;

	@PostMapping(value = "/set")
	public String getAc(@RequestBody AC a) {
		return as.get_Ac(a);

	}

	@PostMapping(value = "post_all")
	public String postall_ac(@RequestBody List<AC> b) {
		return as.postall_ac(b);
	}

	@GetMapping(value = "get_all")
	public List<AC> getall_ac() {
		return as.getall_ac();
	}

	@PutMapping(value = "/update_items/{b}")
	public String update_ac(@RequestBody AC a, @PathVariable int b) {
		return as.update_ac(a, b);
	}

	//// --------------------------------------streams ------------------task
	//// ----------//
	@GetMapping(value = "get_brand")
	public List<String> brand_names() {
		return as.brand_names();

	}

	@GetMapping(value = "/get_brand/{a}")
	public List<AC> getBrand_details(@PathVariable String a) {
		return as.getBrand_details(a);
	}

	@GetMapping(value = "/get_price/{a}/{b}")
	public List<String> getPrice_details(@PathVariable int a, @PathVariable int b) {
		return as.getPrice_details(a, b);
	}

	@GetMapping(value = "/get_discountbrand/{a}/{b}")
	public List<AC> getdiscount_brand(@PathVariable String a, @PathVariable int b) {
		return as.getdiscount_brand(a, b);
	}

	///// -------------------------------------------------------------there is
	///// start is comstom query in mysql ------ ----\\\\

	@GetMapping(value = "/getmatch_brand/{a}")
	public List<AC> getmatch_brand(@PathVariable String a) {
		return as.getmatch_brand(a);
	}

	@GetMapping(value = "/getmax_price")
	public List<AC> getmax_price() {
		return as.getmax_price();
	}

	@GetMapping(value = "/getBrand_length/{a}")
	public List<String> getbrand_length(@PathVariable int a) {
		return as.getbrand_length(a);
	}

	@GetMapping(value = "/getbrand_first/{a}")
	public List<String> getbrand_char(@PathVariable char a) {
		return as.getbrand_char(a);
	}

	//// -----------------------------------------------------Jquery
	//// ---------------------------//

	@GetMapping(value = "/getpricerange/{n1}/{n2}")
	public List<AC> getPriceRange(@PathVariable int n1, @PathVariable int n2) {
		return as.getPriceRange(n1, n2);
	}

	@GetMapping(value = "getPrange/{n}")
	public List<AC> getpricerange(@PathVariable int n) {
		return as.getpricerange(n);
	}

	@GetMapping(value = "get_Lead/{a}")
	public List<AC> get_isLead(@PathVariable boolean a) {
		return as.get_isLead(a);
	}

	@GetMapping(value = "get_char/{a}")
	public List<AC> getIs_char(@PathVariable char a) {
		return as.getIs_char(a);
	}

	@GetMapping(value = "getmatch_brand_name/{a}")
	public List<AC> getbrand_match(@PathVariable String a) {
		return as.getbrand_match(a);
	}

	@GetMapping(value = "get_whole")
	public List<AC> getfull_iteams() {
		return as.getfull_iteams();
	}

}
