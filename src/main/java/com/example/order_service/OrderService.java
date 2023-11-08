package com.example.order_service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService {
    public ArrayList<OrderDetails> orders = new ArrayList<>();
    public void createOrder(OrderDetails orderDetails) {
        orders.add(orderDetails);
    }
}
