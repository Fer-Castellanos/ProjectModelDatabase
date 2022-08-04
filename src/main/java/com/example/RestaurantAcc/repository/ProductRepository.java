package com.example.RestaurantAcc.repository;

import com.example.RestaurantAcc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
