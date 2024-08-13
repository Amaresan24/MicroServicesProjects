package com.example.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.electronics.dao.Tv_dao;
import com.example.electronics.enity.TV;

@Service
public class Tv_service {

	@Autowired
	Tv_dao ts;

	public String get_tv(TV a) {
		return ts.get_tv(a);

	}

	public String post_all(List<TV> a) {
		// TODO Auto-generated method stub
		return ts.post_all(a);
	}

	public TV tv_getid(int b) {
		// TODO Auto-generated method stub
		return ts.tv_getid(b);
	}
}
