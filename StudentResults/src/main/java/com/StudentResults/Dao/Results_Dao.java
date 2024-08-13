package com.StudentResults.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentResults.Entity.Results;
import com.StudentResults.Repo.Results_Repo;
@Repository
public class Results_Dao {
	@Autowired
	Results_Repo  rr;

	public String post_result(List<Results> lst) {
		// TODO Auto-generated method stub
		 rr.saveAll(lst);
		 return "Data saved SuccesFully ";
		 
	}

}
