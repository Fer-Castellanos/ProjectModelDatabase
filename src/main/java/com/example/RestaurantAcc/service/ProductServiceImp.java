package com.example.RestaurantAcc.service;

import com.example.RestaurantAcc.entity.Product;
import com.example.RestaurantAcc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product save(Product newProduct) {
        return productRepository.save(newProduct);
    }

    @Override
    public void deletedById(Long id) {
         productRepository.deleteById(id);

    }
}
