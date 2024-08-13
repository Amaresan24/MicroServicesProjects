package com.example.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.electronics.enity.TV;
import com.example.electronics.respository.Tv_repository;

@Repository
public class Tv_dao {
	@Autowired
	Tv_repository tr;

	public String get_tv(TV a) {
		tr.save(a);

		return "<----------Tv details saved Successfully -------------->";

	}

	public String post_all(List<TV> a) {
		// TODO Auto-generated method stub
		 tr.saveAll(a);
		return "Your Tv Items are Saved sucessfully";
	}

	public TV tv_getid(int b) {
		// TODO Auto-generated method stub
		return tr.findById(b).get();
	}



}
