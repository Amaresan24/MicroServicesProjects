package com.examle.Products_1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examle.Products_1.Entity.Products;
import com.examle.Products_1.Service.ProductsService;

@RestController
public class ProductsController {
	@Autowired
	ProductsService ps;
	
	@PostMapping(value="postAll")
	public String post(@RequestBody List<Products> a) {
		return  ps.post(a);
	}
	@GetMapping(value = "getAll")
	public List<Products> getAll_products(){
		return ps.getAll_products();
	}
	
}
