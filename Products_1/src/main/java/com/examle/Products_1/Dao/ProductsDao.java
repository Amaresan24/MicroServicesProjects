package com.examle.Products_1.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.examle.Products_1.Entity.Products;
import com.examle.Products_1.Repositary.ProductsRepositary;
@Repository
public class ProductsDao {
	@Autowired
	ProductsRepositary pr;
	public String post(List<Products> a) {
		// TODO Auto-generated method stub
		pr.saveAll(a);
		return "Saved";
	}
	public List<Products> getAll_products() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

}
