package com.Gsttax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Gsttax.entity.GstTax;
import com.Gsttax.service.GstTaxService;

@RestController
public class GstTaxController {
	@Autowired
	GstTaxService gts;

	@PostMapping(value = "/postAll_gst")
	public String post_items(@RequestBody List<GstTax> a) {
		return gts.post_items(a);

	}

	@GetMapping(value = "/get_hsnCode/{a}")
	public List<Integer> Get_percentage(@PathVariable int a) {
		return gts.Get_percentage(a);

	}

}
