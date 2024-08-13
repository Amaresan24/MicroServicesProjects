package com.StudentResults.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentResults.Entity.Results;

public interface Results_Repo extends JpaRepository<Results, Integer> {

}