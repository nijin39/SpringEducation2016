package com.tandem6.springedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tandem6.springedu.domain.Customer;
import com.tandem6.springedu.service.EducationService;


@RestController
public class EducationController {
    
    @Autowired
    EducationService educationService;
    
    // /로 들어온 요청에 대한 처리
    // Say HI를 Http Response에 실어서 내보낸다. 
    @RequestMapping("/")
    public String sayHello(){
        return "say HI";
    } 
    
    @RequestMapping("/customers")
    public List<Customer> getCustomerList(){
        return educationService.listAllCustomer();
    }
}
