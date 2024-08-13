package com.StudentMarkSheet.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentMarkSheet.Entity.MarkSheet;
import com.StudentMarkSheet.Repo.MarkSheet_Repo;

@Repository
public class MarkSheet_Dao {
	@Autowired
	MarkSheet_Repo mr;

	public String post_Mark(MarkSheet a) {
		// TODO Auto-generated method stub
		mr.save(a);
		return "Marksheet _ details Saved Succesfully";
	}

	public List<MarkSheet> getStudent_mark() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

}
