package com.Customer.Repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Customer.Entity.Customer;

public interface Customer_Repo extends JpaRepository<Customer, Integer> {

}
