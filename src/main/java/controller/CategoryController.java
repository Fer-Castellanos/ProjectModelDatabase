package controller;

import entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CategoryService;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }
    @GetMapping("/allCategory")
    public List<Category> findAllCategory() {

        return categoryService.findAll();
    }

    @PostMapping("/create-Category")
    Category newCategory(@RequestBody Category newCategory) {
        return categoryService.save(newCategory);

    }

    @DeleteMapping("/delete-Category")
    void deleteCategory(@PathVariable Long id) {
        categoryService.deletedById(id);

    }

    @PutMapping("/update-Category")
    Category updateProduct(@RequestBody Category updateProduct, @PathVariable Long id) {
        Integer product = updateProduct.getProduct();
        System.out.println(product);
        Category category = new Category();
        updateProduct.setProduct(product);
        Category categoryProduct = categoryService.save(updateProduct);
        return categoryProduct;


    }
}
