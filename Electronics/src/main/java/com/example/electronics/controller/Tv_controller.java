package com.example.electronics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.electronics.enity.TV;
import com.example.electronics.service.Tv_service;
import java.util.*;

@RequestMapping("tv")
@RestController
public class Tv_controller {

	@Autowired
	Tv_service ts;

	@PostMapping(value = "/set")
	public String get_tv(@RequestBody TV a) {
		return ts.get_tv(a);
	}

	@PostMapping(value = "/post_all")
	public String post_all(@RequestBody List<TV> a) {
		return ts.post_all(a);

	}

	@GetMapping(value = "/tv_id/{b}")
	public TV tv_getid(int b) {
		return ts.tv_getid(b);

	}

}
