package com.portfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.portfolio.Entity.Enquiry;

import jakarta.validation.constraints.AssertFalse.List;


@Repository
public interface Enquiryrepo extends JpaRepository<Enquiry, Integer> {

	
	
}
