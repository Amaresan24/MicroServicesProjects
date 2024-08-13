package com.World.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.*;
//import com.example.Student.entity.Student;

import ch.qos.logback.core.subst.Token.Type;

@RestController
public class Second_World {
	@Autowired
	RestTemplate add;

	@GetMapping(value = "/get_world")
	public String get_msg() {
		String url = "http://localhost:8080/get_hello";
		ResponseEntity<String> value = add.exchange(url, HttpMethod.GET, null, String.class);
		String str = value.getBody();
		return str;

	}

	@GetMapping(value = "/get_fullstudent")
	public List<Student> get_studentdetail() {
		String urls = "http://localhost:8080/getall_student";
		ResponseEntity<List<Student>> values = add.exchange(urls, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Student>>() {
				});
		List<Student> str1 = values.getBody();
		return str1;

	}

//// ------------> its  getting only brand names on that Apis.......................
	@GetMapping(value = "/get_brand_names")
	public List<String> getBrand_Name() {
		String names_url = "http://localhost:8083/ac/get_brand";
		ResponseEntity<List<String>> brand_names = add.exchange(names_url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<String>>() {
				});

		List<String> brands = brand_names.getBody();
		return brands;
	}

	@GetMapping(value = "/getStudent_age")
	public List<Integer> get_age() {
		String students_url = "http://localhost:8080/getall_student";
		ResponseEntity<List<Student>> values1 = add.exchange(students_url, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Student>>() {
				});

		List<Integer> age = values1.getBody().stream().map(X -> X.getAge()).toList();
		return age;

	}

}
