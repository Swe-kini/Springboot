package com.example.task2.controller;

import com.example.task2.entity.Orders;
import com.example.task2.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping
    public Orders createOrder(@RequestBody Orders order) {
        return orderRepository.save(order);
    }

    @GetMapping
    public List<Orders> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Orders getOrderById(@PathVariable Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @PutMapping("/{id}")
    public Orders updateOrder(@PathVariable Long id, @RequestBody Orders orderDetails) {
        Orders order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        order.setStatus(orderDetails.getStatus());
        return orderRepository.save(order);
    }
}
