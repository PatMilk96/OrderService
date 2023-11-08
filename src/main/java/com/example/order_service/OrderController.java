package com.example.order_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    private OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping ("/CreateOrder")
    public void createOrder(@RequestBody OrderDetails orderDetails){
        orderService.createOrder(orderDetails);
    }
}
