package com.tandem6.springedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tandem6.springedu.domain.Customer;
import com.tandem6.springedu.repository.CustomerRepository;
import com.tandem6.springedu.service.EducationService;


@Service
public class EducationServiceImpl implements EducationService {

    @Autowired
    CustomerRepository customerRepository;
    
    public List<Customer> listAllCustomer(){
        return customerRepository.findAll();
    }

    @Override
    public Customer createCusteomer(String firstName, String lastName) {
        //Valid check is null firstName, lastName
        Customer customer = new Customer("KIM","JONGIL");

        //IF occurs errors below exception
        customerRepository.save(customer);

        return customer;
    }

    @Override
	public Customer getCustomerById(Long id) {
		return customerRepository.findOne(id);
	}
}
