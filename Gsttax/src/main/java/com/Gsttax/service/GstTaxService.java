package com.Gsttax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gsttax.dao.GstTaxDao;
import com.Gsttax.entity.GstTax;

@Service
public class GstTaxService {
	@Autowired
	GstTaxDao gsd;

	public String post_items(List<GstTax> a) {
		// TODO Auto-generated method stub
		return gsd.post_items(a);
	}

	public List<Integer> Get_percentage(int a) {
		// TODO Auto-generated method stub
		return gsd.Get_percentage(a);
	}

}
