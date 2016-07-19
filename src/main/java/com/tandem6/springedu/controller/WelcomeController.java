package com.tandem6.springedu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
public class WelcomeController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        System.out.println("ZZZ");
        return "welcome";
    }
    
    @RequestMapping("/sayhello/{name}")
    public ModelAndView sayhello(@PathVariable String name){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("say");
        mav.addObject("name", name);
        return mav;
    }
    
    // /query?name=lee
    @RequestMapping("/query")
    public ModelAndView query(@RequestParam(value="name",required=true) String name){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("query");
        mav.addObject("name",name);
        return mav;
    }
    
    @RequestMapping("/form")
    public String form(){
        return "form";
    }

    @RequestMapping("/foo")
    public String foo(Map<String, Object> model) {
        throw new RuntimeException("Foo");
    }

}