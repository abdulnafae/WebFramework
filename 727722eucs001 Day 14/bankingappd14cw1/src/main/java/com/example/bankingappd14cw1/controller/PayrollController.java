package com.example.bankingappd14cw1.controller;

import com.example.bankingappd14cw1.model.Payroll;
import com.example.bankingappd14cw1.service.PayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PayrollController {

    private final PayrollService payrollService;

    @Autowired
    public PayrollController(PayrollService payrollService) {
        this.payrollService = payrollService;
    }

    // API Endpoints
    @PostMapping("/employee/{employeeId}/payroll")
    public ResponseEntity<Payroll> createPayroll(@RequestBody Payroll payroll) {
        Payroll savedPayroll = payrollService.savePayroll(payroll);
        return new ResponseEntity<>(savedPayroll, HttpStatus.CREATED);
    }

    // Other endpoints as required
}
