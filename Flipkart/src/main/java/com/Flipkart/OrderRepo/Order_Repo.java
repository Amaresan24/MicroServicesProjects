package com.Flipkart.OrderRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flipkart.Entity.Order_Entity;

public interface  Order_Repo    extends JpaRepository <Order_Entity , Integer>{

	

}
