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

    OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/allOrder")
    public List<Order> findAllOrder() {

        return orderService.findAll();
    }

    @PostMapping("/create-Order")
    Order newOrder(@RequestBody Order newOrder) {
        return orderService.save(newOrder);

    }

    @DeleteMapping("/delete-Order")
    void deleteOrder(@PathVariable Long id) {
        orderService.deletedById(id);

    }

    @PutMapping("/update-Order")
    Order updateOrder(@RequestBody Order updateNewOrder, @PathVariable Long id) {
        Integer Order = updateOrder.getNumOrder();
        System.out.println(Order);
        Order order= new Order();
        updateNewOrder.setOrder(order);
        Order orderNumOrder = orderService.save(updateNewOrder);
        return orderNumOrder;


    }
}
