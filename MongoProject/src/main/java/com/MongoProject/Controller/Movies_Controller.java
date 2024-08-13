package com.MongoProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.MongoProject.Entity.Movies;
import com.MongoProject.Service.Movies_Service;

@RequestMapping("/movie")
public class Movies_Controller {
	@Autowired
	Movies_Service ms;

	@PostMapping("/1")
	public String post_movie(@RequestBody Movies a) {
		return ms.post_movie(a);
	}
}
