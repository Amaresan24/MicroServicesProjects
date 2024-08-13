package com.StudentDetails.CostomException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobelException_Handler {

	@ExceptionHandler(AgeNotMatch_Exception.class)
	public ResponseEntity<Object> AgeNot_match(AgeNotMatch_Exception e) {
		return new ResponseEntity<Object>("---Gobel --Exception --Your is Age  under 18 we cannot proccess Futher --->",
				HttpStatus.BAD_REQUEST);
	}

}
