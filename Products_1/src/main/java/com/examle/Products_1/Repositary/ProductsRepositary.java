package com.examle.Products_1.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examle.Products_1.Entity.Products;

public interface ProductsRepositary extends JpaRepository<Products, Integer> {

}
