package com.example.order_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    private OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @PostMapping("/CreateOrder")
    public String createOrder(@RequestBody OrderDetails orderDetails){
        orderService.createOrder(orderDetails);
        return ("Thanks, your order has been placed!");
    }

    @GetMapping("/GetById")
    public OrderDetails getById(@RequestParam int id){
        return orderService.findById(id);
    }
}
