package service;

import entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService{

    @Autowired

    OrderService orderService;

    @Override
    public List<Order> findAll() {
        return (List<Order>) orderService.findAll();
    }

    @Override
    public Order save(Order newOrder) {
        return orderService.save(newOrder);
    }

    @Override
    public void deletedById(Long id) {
        orderService.deletedById(id);

    }
}
