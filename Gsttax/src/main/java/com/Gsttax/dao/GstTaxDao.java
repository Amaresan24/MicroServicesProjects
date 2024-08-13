package com.Gsttax.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Gsttax.entity.GstTax;
import com.Gsttax.repo.GstTaxRepo;

@Repository
public class GstTaxDao {

	@Autowired
	GstTaxRepo gtr;

	public String post_items(List<GstTax> a) {
		// TODO Auto-generated method stub
		gtr.saveAll(a);
		return "<------------Gst Tax are Saved SuccesFully---------->";
	}

	public List<Integer> Get_percentage(int a) {
		// TODO Auto-generated method stub
		return gtr.Get_percentage(a);
	}

}
