package com.example.Web_Application.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplicationController {

	@GetMapping(value = "/web_view")
	public String getweb() {
    return "this my first Application";
	}

}
