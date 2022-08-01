package service;

import entity.Order;
import entity.Product;

import java.util.List;

public interface ProductService {

     List<Product> findAll(); //get


    Order save(Product newOrder); //create


     void deletedById(Long id); //delete

}
