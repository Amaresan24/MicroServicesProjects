package com.example.electronics.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.electronics.dao.Ac_dao;
import com.example.electronics.enity.AC;

@Service
public class Ac_service {

	@Autowired
	Ac_dao ad;

	public String get_Ac(AC a) {
		return ad.get_Ac(a);

	}

	public String postall_ac(List<AC> b) {
		// TODO Auto-generated method stub
		return ad.postall_ac(b);
	}

	public List<AC> getall_ac() {
		// TODO Auto-generated method stub
		return ad.getall_ac();
	}

	public String update_ac(AC a, int b) {
		// TODO Auto-generated method stub
		AC val = ad.get_id(b);
		val.setBrand(a.getBrand());
		val.setModel(a.getModel());
		val.setisLead(a.getisLead());
		val.setPrice(a.getPrice());

		return ad.update_item(val);

	}

	public List<String> brand_names() {
		List<AC> val = ad.getall_ac();
		// List<String> name = val.stream().map(C -> C.getBrand()).toList();

		List<String> sortedString = val.stream()
				.sorted((a, b) -> Integer.compare(a.getBrand().length(), b.getBrand().length())).map(X -> X.getBrand())
				.collect(Collectors.toList());
		return sortedString;

	}

////////--------------------filter ---------------------brand equals your given brand----------
	public List<AC> getBrand_details(String a) {
		// TODO Auto-generated method stub
		List<AC> name = ad.getall_ac();
		List<AC> brand = name.stream().filter(X -> X.getBrand().equals(a)).collect(Collectors.toList());

		return brand;
	}
//// -------------------------filter ----------price --question-------

	public List<String> getPrice_details(int a, int b) {
		List<AC> pr = ad.getall_ac();
		List<String> price = pr.stream().filter(X -> X.getPrice() > a && X.getPrice() < b).map(C -> C.getBrand())
				.collect(Collectors.toList());
		return price;
	}

///// -------------------filter------discount price -------------

	public List<AC> getdiscount_brand(String a, int b) {
		List<AC> br = ad.getall_ac();
		List<AC> brand = br.stream().filter(X -> X.getBrand().equals(a)).map(C -> {
			int disprice = C.getPrice() - C.getPrice() * b / 100;
			C.setPrice(disprice);
			return C;
		}).collect(Collectors.toList());
		return brand;
	}

///// -------------------------------------------------------in starts in comstom query --------------

	public List<AC> getmatch_brand(String a) {
		// TODO Auto-generated method stub
		return ad.getmatch_brand(a);
	}

	public List<AC> getmax_price() {
		// TODO Auto-generated method stub
		return ad.getmax_price();
	}

	public List<String> getbrand_length(int a) {
		// TODO Auto-generated method stub
		return ad.getbrand_length(a);
	}

	public List<String> getbrand_char(char a) {
		// TODO Auto-generated method stub
		return ad.getbrand_char(a);
	}

	//// -----------------------------------------------------Jquery

	public List<AC> getPriceRange(int n1, int n2) {

		return ad.getPriceRange(n1, n2);
	}

	public List<AC> getpricerange(int n) {
		// TODO Auto-generated method stub
		return ad.getpricerange(n);
	}

	public List<AC> get_isLead(boolean a) {
		// TODO Auto-generated method stub
		return ad.get_isLead(a);
	}

	public List<AC> getIs_char(char a) {
		// TODO Auto-generated method stub
		return ad.getIs_char(a);
	}

	public List<AC> getbrand_match(String a) {
		// TODO Auto-generated method stub
		return ad.getbrand_match(a);
	}

	public List<AC> getfull_iteams() {
		// TODO Auto-generated method stub
		return ad.getfull_iteams();
	}
}