package com.HabJass250.SpringWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControl {
    @RequestMapping("/")
    public  String greet(){
        return "Welcome to Home Page";
    }

    @RequestMapping("/about")
    public  String about(){
        return "Welcome to About Us Page";
    }
}
