package service;

import entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

   @Override
   public  List<Category> findAll() {
      // return (List<Category>) CategoryRepository.findAll;
  // }


    public Category save(Category newCategory) {
        return newCategory;
    }

    static void deletedById(Long id) {
    }

}
