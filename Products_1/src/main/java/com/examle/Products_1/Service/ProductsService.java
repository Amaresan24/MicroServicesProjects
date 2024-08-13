package com.examle.Products_1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examle.Products_1.Dao.ProductsDao;
import com.examle.Products_1.Entity.Products;

@Service
public class ProductsService {
	@Autowired
	ProductsDao pd;
	public String post(List<Products> a) {
		// TODO Auto-generated method stub
		return pd.post(a);
	}
	public List<Products> getAll_products() {
		// TODO Auto-generated method stub
		return pd.getAll_products();
	}

}
