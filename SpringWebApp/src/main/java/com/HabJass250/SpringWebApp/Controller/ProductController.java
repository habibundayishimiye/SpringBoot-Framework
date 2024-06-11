package com.HabJass250.SpringWebApp.Controller;

import com.HabJass250.SpringWebApp.Model.Product;
import com.HabJass250.SpringWebApp.Sevices.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/product")
    public List<Product> getProduct(){
        return service.getProduct();
    }

    @GetMapping("/product/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        Optional<Product> product = service.getProductById(prodId);
        return product.orElse(null);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }

    @PutMapping("/product")
    public  void  updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }


    @DeleteMapping("/product/{prodId}")
    public  void  deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
