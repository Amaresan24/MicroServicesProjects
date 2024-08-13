package com.Flipkart.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Flipkart.Entity.Order_Entity;
import com.Flipkart.OrderDao.Order_Dao;


@Service
public class Order_Service {
@Autowired
Order_Dao or;
	public String post_items(Order_Entity a) {
		return or.post_items(a);
		
	}

}
