package com.example.task1.model;

import lombok.Data;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String department;

    private LocalDate hiredate;
}
