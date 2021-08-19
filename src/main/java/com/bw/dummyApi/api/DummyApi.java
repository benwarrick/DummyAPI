package com.bw.dummyApi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.codec.multipart.Part;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bw.dummyApi.jms.Messenger;
import com.bw.dummyApi.services.ResponsysClientImpl;

@RestController
@RequestMapping(path="/dummy")
public class DummyApi {
	
	@Autowired
	Messenger messenger;

	
	@PostMapping(path = "/email", consumes = "application/json", produces = "application/json")
	public DummyEntity sendEmail(@RequestBody EmailRequest email) {
		System.out.println(email.getTitle() + ": " + email.getMessage());
		System.out.println(email); 
		DummyEntity response = new DummyEntity(); 
		response.setStatus("Success"); 
		response.setDescription("Email sent.");
		return response; 
	}
	
	@PostMapping(path = "/responsys/queue", consumes = "application/json", produces = "application/json")
	public DummyEntity queueResponsys(@RequestBody String email) {
		messenger.send("D365.Utilities.Email.Send.Topic", email);
				
		DummyEntity response = new DummyEntity();
		response.setStatus("Success");
		response.setDescription("Emailed queued for processing");
		
		return response; 
	}
	

}
