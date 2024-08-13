package com.Gsttax.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Gsttax.entity.GstTax;

public interface GstTaxRepo extends JpaRepository<GstTax, Integer> {
	@Query(value = "select percentage from GstTax_table.Gst_items where hsn_code=?", nativeQuery = true)
	public List<Integer> Get_percentage(int a);
	

}
