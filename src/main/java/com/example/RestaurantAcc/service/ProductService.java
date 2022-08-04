package com.example.RestaurantAcc.service;

import com.example.RestaurantAcc.entity.Product;

import java.util.List;

public interface ProductService {

     List<Product> findAll(); //get


    Product save(Product newProduct); //create


     void deletedById(Long id); //delete

}
