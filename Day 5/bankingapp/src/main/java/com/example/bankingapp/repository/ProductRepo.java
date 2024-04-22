package com.example.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bankingapp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}
