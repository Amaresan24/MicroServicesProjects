package com.mongocodes.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mongocodes.Entity.Movie;
import com.mongocodes.Service.Movie_Service;

@RestController
public class Movie_controller {
	@Autowired
	Movie_Service ms;

	@PostMapping(value = "/movie")
	public String post_movie(@RequestBody Movie a) {
		return ms.post_movie(a);
	}
}
