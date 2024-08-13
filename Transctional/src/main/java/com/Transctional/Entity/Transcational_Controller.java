package com.Transctional.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Transcational_Controller {

	@Autowired
	Sender_Repo sr;
	@Autowired
	Recevier_Repo rr;

    @jakarta.transaction.Transactional
	@PostMapping(value = "/post")
	public String post_trans(@RequestBody Transactional t) {
		sr.save(t.getSe());
		// int a = 45/0;
		rr.save(t.getRe());
		return "saved succesfully";
	}

}
