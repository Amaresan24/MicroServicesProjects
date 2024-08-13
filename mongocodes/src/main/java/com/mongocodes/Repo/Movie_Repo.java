package com.mongocodes.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongocodes.Entity.Movie;

public interface Movie_Repo extends MongoRepository<Movie, Integer> {
	// Custom query methods can be defined here
}
