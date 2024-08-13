package com.mongocodes.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongocodes.Dao.Movie_Dao;
import com.mongocodes.Entity.Movie;

@Service
public class Movie_Service {
	@Autowired
	Movie_Dao md;
	

	public String post_movie(Movie a) {
		// TODO Auto-generated method stub
		return md.post_movie(a);
	}

}
