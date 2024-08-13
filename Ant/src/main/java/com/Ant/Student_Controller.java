package com.Ant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {
	// @Value("Amaresh")
	@Value("${myName}")
	// String name;

	@GetMapping("/getnames")
	public String get_name() {
		return "Java";
	}

	@GetMapping(value = "/hello/{name}")
	public String sayHello(@RequestParam(required = false) @PathVariable String name) {
		if (name != null) {
			return "Hello, " + name + "!";
		} else {
			return "Hello, Guest!";
		}
	}

}
