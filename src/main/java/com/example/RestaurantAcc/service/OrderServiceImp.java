package com.example.RestaurantAcc.service;

import com.example.RestaurantAcc.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.RestaurantAcc.repository.OrderRepository;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService{

    @Autowired

    OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {

        return (List<Order>) orderRepository.findAll();
    }

    @Override
    public Order save(Order newOrder) {

        return orderRepository.save(newOrder);
    }

    @Override
    public void deletedById(Long id) {
        orderRepository.deleteById(id);

    }
}
