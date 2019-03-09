package com.hcq.controller;

import com.hcq.dao.CarMapper;
import com.hcq.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class hello {
    @Autowired
    CarService service;
    @RequestMapping("/hello")
    public String hello(){
        List list=service.getNames();
        return list.toString();
    }
}
