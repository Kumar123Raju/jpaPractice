package com.example.jpapracticie.jpapractice.repositories;

import com.example.jpapracticie.jpapractice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
