package com.mongocodes.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongocodes.Entity.Movie;
import com.mongocodes.Repo.Movie_Repo;

@Repository
public class Movie_Dao {

	@Autowired
	Movie_Repo mr;
	public String post_movie(Movie a) {
		// TODO Auto-generated method stub
		mr.save(a);
		return "saved data succesfully";
	}

}
