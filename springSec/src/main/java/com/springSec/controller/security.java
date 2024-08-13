package com.springSec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class security {

	@GetMapping("/view")
	public String getMsg() {
		return "Hai Amaresh !";
	}

	@GetMapping("/manager")
	public String getmanager() {
		return "Hai welcome Manger !";
	}

	@GetMapping("/student")
	public String getstudent() {
		return "Hai students !";
	}

	@GetMapping("/triner")
	public String gettriner() {
		return "Hai trainer!";
	}

}
