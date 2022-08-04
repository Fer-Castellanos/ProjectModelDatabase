package com.example.RestaurantAcc.service;

import com.example.RestaurantAcc.entity.Category;
import com.example.RestaurantAcc.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public Category save(Category newCategory) {
        return categoryRepository.save(newCategory);
    }

    @Override
    public void deletedById(Long id) {
        categoryRepository.deleteById(id);

    }
}
