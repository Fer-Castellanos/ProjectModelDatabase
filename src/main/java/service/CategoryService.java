package service;

import entity.Category;

import java.util.List;

public interface CategoryService {

     List<Category> findAll(); //get


      Category save(Category newCategory); //create


     void deletedById(Long id); //delete



}
