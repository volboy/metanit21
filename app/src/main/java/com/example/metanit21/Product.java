package com.example.metanit21;

import java.io.Serializable;

public class Product implements Serializable {

    private String name;
    private String company;
    private int price;

    public Product(String name, String company, int price){
        this.name=name;
        this.company=company;
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company=company;
    }
    public Integer getPrice(){
        return price;
    }

    public void setPrice(Integer price){
        this.price=price;
    }
}
