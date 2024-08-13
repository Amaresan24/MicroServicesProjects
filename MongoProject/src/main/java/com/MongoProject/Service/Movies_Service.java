package com.MongoProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MongoProject.Dao.Movies_Dao;
import com.MongoProject.Entity.Movies;

@Service
public class Movies_Service {
	@Autowired
	Movies_Dao md;

	public String post_movie(Movies a) {
		// TODO Auto-generated method stub
		return md.post_movie(a);
	}

}
