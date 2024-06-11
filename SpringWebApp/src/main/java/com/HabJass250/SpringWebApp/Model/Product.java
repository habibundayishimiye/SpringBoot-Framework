package com.HabJass250.SpringWebApp.Model;

//import lombok.Data;
//
//@Data
public class Product {
    private  int Id;
    private  String  Name;
    private  int Price;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public Product(int id, String name, int price) {
        this.Id = id;
        this.Name = name;
        this.Price = price;
    }
}
