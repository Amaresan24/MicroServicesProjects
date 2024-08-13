package com.Flipkart.OrderController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Flipkart.Entity.Order_Entity;
import com.Flipkart.OrderService.Order_Service;

@RestController
public class Order_Controller {
@Autowired
Order_Service os;


@PostMapping(value = "/post_details")
public String post_items(@RequestBody Order_Entity a) {
	return os.post_items(a);
}


}
