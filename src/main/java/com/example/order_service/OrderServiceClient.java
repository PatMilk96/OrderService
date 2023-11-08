package com.example.order_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Confirm-User", url = "http://localhost:8081")
public interface OrderServiceClient {
    @PostMapping("/confirmUser")
    int details(@RequestParam int customerId);
}
