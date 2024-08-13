package com.OrderService.Controller;


import com.OrderService.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public String getOrders() {
        String users = orderService.getUsers();
        return "Orders and " + users;
    }
}
