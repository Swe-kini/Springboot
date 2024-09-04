package com.example.task1.controller;

import com.example.task1.model.Employee;
import com.example.task1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/find")
    public List<Employee> getEmployeesByYearAndDepartment(@RequestParam int year, @RequestParam String department) {
        return employeeRepository.findEmployeesByYearAndDepartment(year, department);
    }
}
