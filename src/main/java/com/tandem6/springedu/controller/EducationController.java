package com.tandem6.springedu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EducationController {
    
    @RequestMapping("/")
    public String sayHello(){
        return "say HI";
    } 
}
