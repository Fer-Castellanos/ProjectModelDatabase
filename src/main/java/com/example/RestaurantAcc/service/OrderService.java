package com.example.RestaurantAcc.service;

import com.example.RestaurantAcc.entity.Order;

import java.util.List;

public interface OrderService {


     List<Order> findAll(); //get



     Order save(Order newOrder); //create


     void deletedById(Long id); //delete

}
