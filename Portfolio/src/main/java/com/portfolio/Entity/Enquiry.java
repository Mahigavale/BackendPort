package com.portfolio.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Enquiry {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int enquiryid;
	
	public String name;
	
	public String email;
	
	
	public String mobilenumber;
	
	public String getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	@Column(columnDefinition="TEXT")
	public String subject;


	public int getEnquiryid() {
		return enquiryid;
	}


	public void setEnquiryid(int enquiryid) {
		this.enquiryid = enquiryid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
}
