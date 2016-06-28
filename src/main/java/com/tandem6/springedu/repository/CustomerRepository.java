package com.tandem6.springedu.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tandem6.springedu.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}