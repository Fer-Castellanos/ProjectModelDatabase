package service;

import entity.Category;
import entity.Order;

import java.util.List;

public interface OrderService {


     List<Order> findAll(); //get



     Order save(Order newOrder); //create


     void deletedById(Long id); //delete

}
