package com.HabJass250.SpringWebApp.Sevices;

import com.HabJass250.SpringWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "iPhone", 1500),
            new Product(102, "Samsung", 1400),
            new Product(103, "Google Pixel", 1300),
            new Product(104, "Huawe", 1200),
            new Product(105, "Microsoft", 1100),
            new Product(106, "Nokia", 1000)
    ));

    public List<Product> getProduct() {
        return products;
    }


    public Optional<Product> getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getId() == prodId)
                .findFirst();
    }

    public void addProduct(Product product) {

        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for (int i = 0; i<products.size(); i++){
            if (products.get(i).getId() == product.getId())
                index = i;
            products.set(index, product);
        }
    }

    public void deleteProduct( int prodId) {
       int index =0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId()== prodId){
                index = i;
            }

        }
        products.remove(index);
    }}
