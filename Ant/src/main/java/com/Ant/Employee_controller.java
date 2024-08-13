package com.Ant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_controller {
	@Autowired
	Employee e;
	
	@GetMapping("/get")
	public String get() {
		return e.get_mes();
	
	}

}
