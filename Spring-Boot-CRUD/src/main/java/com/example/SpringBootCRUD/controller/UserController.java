package com.example.SpringBootCRUD.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {
    @GetMapping("/getUer")
    public String getUser(){
        return "Simple-Root";
    }
}
