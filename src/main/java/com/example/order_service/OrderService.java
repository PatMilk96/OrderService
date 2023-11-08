package com.example.order_service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class OrderService {
    public ArrayList<OrderDetails> orders = new ArrayList<>();
    public void createOrder(OrderDetails orderDetails) {
        orders.add(orderDetails);
    }

    public OrderDetails findById(int id) {
        for(OrderDetails order : orders){
            if(order.getId() == id) {
                return order;
            }
        }
        return null;
    }
}
