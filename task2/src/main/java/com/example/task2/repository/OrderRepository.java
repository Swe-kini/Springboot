package com.example.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.task2.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {
}
