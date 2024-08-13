package com.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Entity.Bank;
import com.Bank.Service.Bank_Service;

@RestController
public class Bank_controller {
	@Autowired
	Bank_Service bs;

	@PostMapping(value = "postbank_details")
	public String post_bank(@RequestBody List<Bank> a) {
		return bs.post_bank(a);
	}

	@GetMapping(value = "/get_branch/{a}")
	public String get_branch(@PathVariable String a) {
		return bs.get_branch(a);
	}

	@GetMapping(value = "/getbank_details")
	public List<Bank> get_bank() {
		return bs.get_bank();
	}

}
