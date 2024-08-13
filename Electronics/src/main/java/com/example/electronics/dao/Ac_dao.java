package com.example.electronics.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.electronics.enity.AC;
import com.example.electronics.respository.Ac_repository;

@Repository
public class Ac_dao {
	@Autowired
	Ac_repository ar;

	public String get_Ac(AC a) {
		ar.save(a);

		return "<----------AC details saved Successfully -------------->";

	}

//	public List<AC> getfull_Ac(List<AC> a) {
//		// TODO Auto-generated method stub
//		return ar.findAll();
//	}

	public String postall_ac(List<AC> b) {
		// TODO Auto-generated method stub
		ar.saveAll(b);
		return "<-----------------Saved succesfully full List ---------->";
	}

	public AC get_id(int a) {
		return ar.findById(a).get();
	}

	public String update_item(AC a) {
		ar.save(a);
		return "Your iteams Update  succesfully ";
	}

	public List<AC> getall_ac() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

	//// --------------------------------------------- start in comstom query
	//// -------////

	public List<AC> getmatch_brand(String a) {
		// TODO Auto-generated method stub
		return ar.getmatch_brand(a);
	}

	public List<AC> getmax_price() {
		// TODO Auto-generated method stub
		return ar.getmax_price();
	}

	public List<String> getbrand_length(int a) {
		// TODO Auto-generated method stub
		return ar.getbrand_length(a);
	}

	public List<String> getbrand_char(char a) {
		// TODO Auto-generated method stub
		return ar.getbrand_char(a);
	}
	//// -----------------------------------------------------Jquery
	//// ---------------------------//

	public List<AC> getPriceRange(int n1, int n2) {
		// TODO Auto-generated method stub
		return ar.getPriceRange(n1, n2);
	}

	public List<AC> getpricerange(int n) {
		// TODO Auto-generated method stub
		return ar.getpricerange(n);
	}

	public List<AC> get_isLead(boolean a) {
		// TODO Auto-generated method stub
		return ar.get_isLead(a);
	}

	public List<AC> getIs_char(char a) {
		// TODO Auto-generated method stub
		return ar.getIs_char(a);
	}

	public List<AC> getbrand_match(String a) {
		// TODO Auto-generated method stub
		return ar.getbrand_match(a);
	}

	public List<AC> getfull_iteams() {
		// TODO Auto-generated method stub
		return ar.getfull_iteams();
	}

}
