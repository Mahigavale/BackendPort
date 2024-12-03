package com.portfolio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.Entity.Enquiry;
import com.portfolio.Service.Enquiryservice;



@RestController
@CrossOrigin(origins = "*")
public class Enqirycontroller {
	
	
	
	@Autowired
	private Enquiryservice service;
	
	
	
	@PostMapping("/add-enq")
	public Enquiry addenq(@RequestBody Enquiry enquiry) throws Exception
	{
		
		System.out.println(enquiry.getEmail());
		
		return service.addenquiry(enquiry);
	}

}
