package com.tandem6.springedu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.tandem6.springedu.domain.Customer;

/*
 * DAO의 역할을 수행한다고 보면됨.
 * 간단한 CRUD는 별도 로직의 구현이 없이 바로 사용할 수 있음.
 * 
 * CrudRepositry는 기본적인 CRUD를 미리 정의해 놓음.
 * 사용법은 CrudRepository<도메인객체, 도메인객체의 키 형태>
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // select * from Customer wherer lastname = :lastname
    List<Customer> findByLastName(String lastName);
}