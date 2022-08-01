package service;

import entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    CategoryService categoryService;

    @Override
    public List<Category> findAll() {
        return (List<Category>) categoryService.findAll();
    }

    @Override
    public Category save(Category newCategory) {
        return categoryService.save(newCategory);
    }

    @Override
    public void deletedById(Long id) {
        categoryService.deletedById(id);

    }
}
