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

    @GetMapping("/allCategory")
    public List<Category> findAllCategory() {

        return CategoryService.findAll();
    }

    @PostMapping("/create-Category")
    Category newCategory(@RequestBody Category newCategory) {
        return CategoryService.save(newCategory);

    }

    @DeleteMapping("/delete-Category")
    void deleteCategory(@PathVariable Long id) {
        CategoryService.deletedById(id);

    }

    @PutMapping("/update-Category")
    Category updateProduct(@RequestBody Category updateProduct, @PathVariable Long id) {
        Integer product = updateProduct.getProduct();
        System.out.println(product);
        Category category = new Category();
        updateProduct.setProduct(product);
        Category categoryProduct = CategoryService.save(updateProduct);
        return categoryProduct;


    }
}
