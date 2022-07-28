package service;

import entity.Category;

import java.util.List;

public interface CategoryService {

    static List<Category> findAll() {
        return null;
    }

    static Category save(Category newCategory) {
        return newCategory;
    }

    static void deletedById(Long id) {
    }


}
