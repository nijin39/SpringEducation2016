package com.tandem6.springedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tandem6.springedu.domain.Customer;
import com.tandem6.springedu.repository.CustomerRepository;


@Service
public class EducationService {

    @Autowired
    CustomerRepository customerRepository;
    
    public List<Customer> listAllCustomer(){
        return customerRepository.findAll();
    }
}
