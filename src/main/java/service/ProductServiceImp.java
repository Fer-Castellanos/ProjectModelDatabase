package service;

import entity.Order;
import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    ProductService productService;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productService.findAll();
    }

    @Override
    public Order save(Product newProduct) {
        return productService.save(newProduct);
    }

    @Override
    public void deletedById(Long id) {
         productService.deletedById(id);

    }
}
