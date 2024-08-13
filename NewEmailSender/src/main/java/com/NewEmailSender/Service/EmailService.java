package com.NewEmailSender.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.NewEmailSender.Entity.Email;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;
	
	@Value("@{spring.mail.username}")
	private String  fromMail;
	
	public void sendMail(String mail , Email email) {
SimpleMailMessage simplmailmessage = new SimpleMailMessage();
		
simplmailmessage.setFrom(mail);	
simplmailmessage.setSubject(email.getSubject());
simplmailmessage.setText(email.getMessage());
simplmailmessage.setTo(mail);

mailSender.send(simplmailmessage);
		
	}
	
}
