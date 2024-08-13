package com.Customer.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Customer.Entity.Customer;
import com.Customer.Repo.Customer_Repo;

@Repository
public class Customer_Dao {
	@Autowired
	Customer_Repo cr;

	public String postall_customer(Customer a) {
		// TODO Auto-generated method stub
		cr.save(a);
		return "------- -Your data saved SuccesFully---------";
	}

	public String post_list(List<Customer> a) {
		// TODO Auto-generated method stub
		cr.saveAll(a);
		return "-------------------Your List Of Data saved Succesfully--------";
	}

}
