package com.HabJass250.SpringWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginContralor {
    @RequestMapping("/login")
    public String login(){
        return "Welcome to Logine Page";
    }
}
