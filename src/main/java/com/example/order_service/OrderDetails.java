package com.example.order_service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {
    private int id;
    private int productId;
    private int quantity;
    private int customerId;
}
