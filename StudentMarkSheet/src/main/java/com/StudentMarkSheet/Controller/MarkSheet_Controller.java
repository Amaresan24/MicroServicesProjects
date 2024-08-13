package com.StudentMarkSheet.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentMarkSheet.Entity.MarkSheet;
import com.StudentMarkSheet.Service.MarkSheet_Service;
import java.util.*;

@RestController
public class MarkSheet_Controller {
	@Autowired
	MarkSheet_Service ms;

	@PostMapping(value = "/postall_mark")
	public String post_Mark(@RequestBody MarkSheet a) {
		return ms.post_Mark(a);
	}

	@GetMapping(value = "/getall_mark")
	public List<MarkSheet> getStudent_mark(){
		return ms.getStudent_mark();
	}
	
	
}
