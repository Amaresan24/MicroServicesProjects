package com.StudentDetails.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentDetails.Entity.Student;
import com.StudentDetails.Repo.Student_Repo;

@Repository
public class Student_Dao {
	@Autowired
	Student_Repo sr;

	public String post_student(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
		return "----------Student Details Save SuccesFully--------";
	}

	public String postall_student(List<Student> a) {
		// TODO Auto-generated method stub
		sr.saveAll(a);
		return "--------Succesfully Saved All Student------------";
	}

	public Student getStudent_id(int a) {
		// TODO Auto-generated method stub
		return sr.findById(a).get();
	}

	public List<Student> getall_Student() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	public String delete_student(int a) {
		// TODO Auto-generated method stub
		sr.deleteById(a);
		return "--------Delete student ---succesFully";
	}

	public String delete_full() {
		// TODO Auto-generated method stub
		sr.deleteAll();
		return "<-----Delete succesFully full list-------->";
	}

	

}
