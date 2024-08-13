package com.Customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.Customer.Dao.Customer_Dao;
import com.Customer.Entity.Customer;

@Service
public class Customer_Service {
	@Autowired
	Customer_Dao cd;
	RestTemplate add;

////  -------------------one object data posting ----------------------

	public String postall_customer(Customer a) {

		String url = "http://localhost:8080/get_branch/";
		String code = a.getIfsc_code();
		ResponseEntity<String> value = add.exchange(url + code, HttpMethod.GET, null, String.class);
		String branch = value.getBody();
		a.setBranch(branch);
		return cd.postall_customer(a);
	}

//// -----------------List of Data posting ------------------

	public String post_list(List<Customer> a) {
		String ur2 = "http://localhost:8080/get_branch/";

		for (Customer X : a) {
			String code2 = X.getIfsc_code();
			ResponseEntity<String> value2 = add.exchange(ur2 + code2, HttpMethod.GET, null, String.class);
			String lis = value2.getBody();
			X.setBranch(lis);
}

		return cd.post_list(a);
		
	}

}
