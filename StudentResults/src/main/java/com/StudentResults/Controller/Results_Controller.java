package com.StudentResults.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.StudentResults.Entity.Results;
import com.StudentResults.Service.Results_Service;
import java.util.*;

@RestController
public class Results_Controller {
	@Autowired
	RestTemplate add;
	Results_Service rs;

	@PostMapping(value = "/topper_student")
	public String set_all(@RequestBody List<Results> results) {

		List<Results> lst = results;
		String url1 = "http://localhost:8080/getall_Student";
		String url2 = "http://localhost:8081/getall_mark";

		// int sr1 = X.getRollnumber();
		ResponseEntity<Student> res1 = add.exchange(url1, HttpMethod.GET, null,
				new ParameterizedTypeReference<Student>() {
				});
		ResponseEntity<Mark> res2 = add.exchange(url2, HttpMethod.GET, null, new ParameterizedTypeReference<Mark>() {
		});

		Student stu = res1.getBody();
		Mark mar = res2.getBody();

		for (Results X : lst) {

			X.setName(stu.getName());
			X.setRollnumber(stu.getRollnumber());

			int total = mar.getSem1Total() + mar.getSem2Total();

			if (stu.isAttendance() >= 90 && total < 395) {
				X.setTotalmarks(total + 5);
			} else {
				X.setTotalmarks(total);
			}

			X.setPercentage((mar.getSem1Total() + mar.getSem2Total()) / 4);
			lst.add(X);
		}

		return rs.post_result(lst);

	}

}
