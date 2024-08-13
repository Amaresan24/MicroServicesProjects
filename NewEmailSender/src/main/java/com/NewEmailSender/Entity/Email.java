package com.NewEmailSender.Entity;


public class Email {

	private String subject;
	public String getSubject() {
		return subject;
	}
	public String getMessage() {
		return message;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String message;
	
}
