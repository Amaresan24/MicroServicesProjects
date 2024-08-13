package com.Flipkart.OrderDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Flipkart.Entity.Order_Entity;
import com.Flipkart.OrderRepo.Order_Repo;

@Repository
public class Order_Dao {
	@Autowired
	Order_Repo  or;

	public String post_items(Order_Entity a) {
		// TODO Auto-generated method stub
		or.save(a);
		return "<-----Your ----data ---saved -succesfully------->";
	}
	


}
