package com.Flipkart.Product_Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flipkart.Product_Entity.Product;

public interface Produt_Repo extends JpaRepository<Product, Integer> {

}
