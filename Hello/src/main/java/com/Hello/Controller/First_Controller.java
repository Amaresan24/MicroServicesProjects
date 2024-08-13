package com.Hello.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First_Controller {
	@GetMapping(value = "/get_hello")
	public String get_this() {
		return "<--------------This message is shown on first Api ---------->";
	}
}
