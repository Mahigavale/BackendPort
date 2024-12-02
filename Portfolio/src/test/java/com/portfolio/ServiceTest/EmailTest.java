package com.portfolio.ServiceTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.portfolio.Entity.Enquiry;
import com.portfolio.Service.EmailService;
import com.portfolio.Service.Enquiryservice;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
public class EmailTest {
	
	
	
	
	@Autowired
	
	public Enquiryservice service2;
	
	@Autowired
	public EmailService service;
	
	
	@Test
	public void sendmailtest() throws Exception
	{
		
		//arrange
		
		Enquiry enq=new Enquiry();
		
		enq.setEmail("maheshgavale05178@gmail.com");
		//enq.setEnquiryid(3);
		enq.setMobilenumber("7774834341");
		enq.setName("mahesh gavale");
		enq.setSubject("Regarding Job as Java Trainer");
		
		//act
		
		Enquiry enq2=service2.addenquiry(enq);
		
	//assert
		
		Assertions.assertThat(enq.getName()==enq2.getName());
		
		
	}
	
	@Test
	public void null_object_must_throw_an_exception()
	{
		Enquiry enq=new Enquiry();
		
		
	assertThrows(Exception.class, ()-> {
		
		service2.addenquiry(enq);
		
	});
	

	

}
}
