package com.Customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Customer.Entity.Customer;
import com.Customer.Service.Customer_Service;

@RestController
public class Customer_Controller {
	@Autowired
	Customer_Service cs;

	@PostMapping(value = "/post_customer")
	public String postall_customer(@RequestBody Customer a) {
		return cs.postall_customer(a);
	}

	@PostMapping(value = "/postall_customer")
	public String post_list(@RequestBody List<Customer> a) {

		return cs.post_list(a);
	}

}
