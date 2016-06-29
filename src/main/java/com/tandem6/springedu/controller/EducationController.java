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
    
    // Controller : 주소 받아주고 서비스를 처리해서 결과를 리턴해준다.
    // Service : 실제 비지니스를 수행한다.
    // Repository : DB Access를 수행한다.
    // Controller -> Service -> Repository(Mybatis):M -> DB
    @RequestMapping("/customers")
    public List<Customer> getCustomerList(){
        return educationService.listAllCustomer();
    }
}
