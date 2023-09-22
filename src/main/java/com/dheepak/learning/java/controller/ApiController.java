package com.dheepak.learning.java.controller;

import com.dheepak.learning.java.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    ApiService apiService;

    @GetMapping("/hello")
    public String hello(){
        return apiService.hello();
    }

}
