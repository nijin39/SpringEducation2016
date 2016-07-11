package com.tandem6.springedu.service;

import java.util.List;

import com.tandem6.springedu.domain.Customer;

public interface EducationService {

	// C
	Customer createCusteomer( String firstName, String lastName);

	// R
	public Customer getCustomerById(Long id);
	public List<Customer> listAllCustomer();
	
	// U
	
	// D
}
