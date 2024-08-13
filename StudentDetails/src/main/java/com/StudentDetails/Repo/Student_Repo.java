package com.StudentDetails.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentDetails.Entity.Student;

public interface Student_Repo extends JpaRepository<Student, Integer> {

}
