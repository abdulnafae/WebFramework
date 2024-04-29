package com.example.bankingappday12cw1.controller;

import com.example.bankingappday12cw1.model.Employee;
import com.example.bankingappday12cw1.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/inner-join")
    public ResponseEntity<List<Employee>> getEmployeesInnerJoin() {
        List<Employee> employees = employeeService.getEmployeesInnerJoin();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/left-outer-join")
    public ResponseEntity<List<Employee>> getEmployeesLeftOuterJoin() {
        List<Employee> employees = employeeService.getEmployeesLeftOuterJoin();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
