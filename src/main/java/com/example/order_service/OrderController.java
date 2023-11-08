package com.example.order_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    private OrderService orderService;
    private OrderServiceClient orderServiceClient;
    @Autowired
    public OrderController(OrderService orderService, OrderServiceClient orderServiceClient){
        this.orderService = orderService;
        this.orderService = orderService;
    }

    @PostMapping("/CreateOrder")
    public String createOrder(@RequestBody OrderDetails orderDetails){
        int customerId = orderDetails.getCustomerId();
        if(orderServiceClient.details(customerId) == customerId) {
            orderService.createOrder(orderDetails);
            return("Order Added");
        }
        else return ("Oops, something went wrong");
    }

    @GetMapping("/getById")
    public OrderDetails getById(@RequestParam int id){
        return orderService.findById(id);
    }
}
