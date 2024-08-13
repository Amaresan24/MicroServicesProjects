package com.StudentResults.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentResults.Dao.Results_Dao;
import com.StudentResults.Entity.Results;
@Service
public class Results_Service {
@Autowired
Results_Dao rd;
	
	
	public String post_result(List<Results> lst) {
		// TODO Auto-generated method stub
		return rd.post_result(lst);
	}

}
