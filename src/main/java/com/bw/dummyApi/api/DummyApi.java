package com.bw.dummyApi.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/dummy")
public class DummyApi {
	
	@PostMapping(path = "/email", consumes = "application/json", produces = "application/json")
	public ResponseEntity sendEmail(@RequestBody EmailRequest email) {
		System.out.println(email.getTitle() + ": " + email.getMessage());
		System.out.println(email); 
		ResponseEntity response = new ResponseEntity(); 
		response.setStatus("Success"); 
		response.setDescription("Email sent.");
		return response; 
	}
}
