package com.StudentMarkSheet.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentMarkSheet.Entity.MarkSheet;



public interface  MarkSheet_Repo   extends JpaRepository<MarkSheet, Integer> {
	
}
