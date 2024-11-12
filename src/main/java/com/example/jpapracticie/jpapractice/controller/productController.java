package com.example.jpapracticie.jpapractice.controller;

import com.example.jpapracticie.jpapractice.entities.Product;
import com.example.jpapracticie.jpapractice.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class productController {

    @Autowired
    public ProductRepository repo;

    @PostMapping("/save")
    public void save(){
        Product product=new Product();
        product.setTitle("Grocery");
        repo.save(product);
        System.out.println("all ok");

    }
}
