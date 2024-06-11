package com.Hab.Jass250.MyApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary  // you can use Primary  to display desktop not Laptop in computer
public class Desktop implements Computer {
    public  void  Compile(){
        System.out.println("compile 404 bugs but very faster");
    }
}
