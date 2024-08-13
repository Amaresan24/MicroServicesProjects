package com.NewEmailSender.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.NewEmailSender.Entity.Email;
import com.NewEmailSender.Service.EmailService;

@RestController
@RequestMapping("/mail")
public class EmailController {

	@Autowired
	private EmailService  mailservice; 
	
	@PostMapping("/send/{mail}")
	public String sendMail(@PathVariable String mail ,@RequestBody Email email ) {
		
		mailservice.sendMail(mail, email);
		
		return "<--------Mail Send SuccesFully--------->";
		
		
	}
	
	
}
