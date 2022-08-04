package com.example.RestaurantAcc.controller;

import com.example.RestaurantAcc.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.RestaurantAcc.service.OrderService;
import com.example.RestaurantAcc.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    ProductController(OrderService orderService){
        this.productService = productService;
    }

    @GetMapping("/allProduct")
    public List<Product> findAllProduct() {

        return productService.findAll();
    }

    @PostMapping("/create-Product")
    Product newProduct(@RequestBody Product newOrder) {
        return productService.save(newOrder);

    }

    @DeleteMapping("/delete-Product")
    void deleteProduct(@PathVariable Long id) {
        productService.deletedById(id);

    }

    @PutMapping("/update-Product")
    Product updateNewProduct(@RequestBody Product updateNewProduct) {

        return productService.save(updateNewProduct);

    }

}
