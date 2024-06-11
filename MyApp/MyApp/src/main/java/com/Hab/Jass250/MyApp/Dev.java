package com.Hab.Jass250.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired  //Field Injaction
@Qualifier("laptop") // you can use @Qualifier("  ") to choose Laptop od Desktop to be displayed in Computer
    private Computer comp;

//    private Laptop laptop;
//    public  Dev(Laptop laptop){ //Constructor Injaction
//        this.laptop = laptop;
//    }

//    @Autowired
//    private Laptop laptop;
//    public void  setLaptop(Laptop laptop){ //setter Injaction
//        this.laptop = laptop;
//    }

    public    void Build(){
        comp.Compile();
        System.out.println("Let us Build an App Project");
    }
}
