package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @RequestMapping("/register")
    public String getRegisterPage() {
        return "register_page";
    }
    @GetMapping("/login")
    public String getLoginPage(){
        return "login_page";
    }
    @GetMapping("/error")
    public String getErrorPage(){
        return "login_page";
    }
}
