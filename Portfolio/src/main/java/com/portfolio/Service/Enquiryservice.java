package com.portfolio.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.Entity.Enquiry;
import com.portfolio.Repository.Enquiryrepo;

@Service
public class Enquiryservice {

	@Autowired
	private Enquiryrepo repo;

	@Autowired
	private EmailService service;

	public Enquiry addenquiry(Enquiry enquiry) throws Exception {

		System.out.println(enquiry.getEmail());

		String email = enquiry.getEmail();
		String name=enquiry.getName().toUpperCase();

		if (enquiry != null)

		{
			service.sendHtmlEmail(email,name);

			return repo.save(enquiry);

		} else {
			throw new Exception("something went Wrong !");
		}
	}

}
