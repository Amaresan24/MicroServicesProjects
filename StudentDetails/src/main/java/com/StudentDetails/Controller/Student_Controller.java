package com.StudentDetails.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDetails.CostomException.AgeNotMatch_Exception;
import com.StudentDetails.Entity.Student;
import com.StudentDetails.Service.Student_Service;
import java.util.*;

@RestController
public class Student_Controller {
	@Autowired
	Student_Service ser;

///   post student one by one ---------//
	@PostMapping(value = "/post_student")
	public String post_student(@RequestBody Student s) throws AgeNotMatch_Exception {
		return ser.post_student(s);
	}
/// post List of All student --------------//
	@PostMapping(value = "/postall_student")
	public String postall_student(@RequestBody List<Student> a) {
		return ser.postall_student(a);
	}
// getByid student 
	@GetMapping(value = "/getStudent_id/{a}")
	public Student getStudent_id(@PathVariable int a) {
		return ser.getStudent_id(a);
	}
	// getall _List of Student
	@GetMapping(value = "/getall_Student")
	public List<Student> getall_Student(){
		return ser.getall_Student();
	}
// updateing ---------by _id
	@PutMapping(value = "/update_student/{a}")
	public String update_student(@RequestBody Student s , @PathVariable int a) {
		return ser.update_student(s,a);
	}
	
	//// deleting given  id -----------
	@DeleteMapping(value = "/delete_id/{a}")
	public String delete_student(@PathVariable int a) {
		return ser.delete_student(a);
	}
	@DeleteMapping(value = "/delete_all")
	public String  delete_full() {
		return ser.delete_full();
	}
	 @GetMapping(value = "/get_attendence")
	 public List<Integer> get_att() {
		 return ser.get_att();
	 }
	
	
	
}
