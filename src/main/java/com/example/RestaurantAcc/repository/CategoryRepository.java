package com.example.RestaurantAcc.repository;

import com.example.RestaurantAcc.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository< Category, Long > {
}
