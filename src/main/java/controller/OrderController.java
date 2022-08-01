package controller;

import entity.Category;
import entity.Order;
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
import service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/allOrder")
    public List<Order> findAllOrder() {

        return OrderService.findAll();
    }

    @PostMapping("/create-Order")
    Order newOrder(@RequestBody Order newOrder) {
        return OrderService.save(newOrder);

    }

    @DeleteMapping("/delete-Order")
    void deleteOrder(@PathVariable Long id) {
        OrderService.deletedById(id);

    }

    @PutMapping("/update-Order")
    Order updateNumOrder(@RequestBody Order updateNewOrder, @PathVariable Long id) {
        Integer NumOrder = updateNumOrder.getNumOrder();
        System.out.println(NumOrder);
        Order order= new Order();
        updateNewOrder.setOrder(order);
        Order orderNumOrder = OrderService.save(updateNewOrder);
        return orderNumOrder;


    }
}
