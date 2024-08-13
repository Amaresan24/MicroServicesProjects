package com.MongoProject.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.MongoProject.Entity.Movies;
import com.MongoProject.Repo.Movies_Repo;
@Repository
public class Movies_Dao {
@Autowired
Movies_Repo mr;
	public String post_movie(Movies a) {
		// TODO Auto-generated method stub
		mr.save(a);
		return "Saved successfully";
	}

}
