package com.MongoProject.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.MongoProject.Entity.Movies;


public interface  Movies_Repo extends MongoRepository<Movies, Integer> {
	// Custom query methods can be defined here
}