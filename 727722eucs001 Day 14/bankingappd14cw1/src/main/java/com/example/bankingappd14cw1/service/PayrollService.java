package com.example.bankingappd14cw1.service;

import com.example.bankingappd14cw1.model.Payroll;
import com.example.bankingappd14cw1.repository.PayrollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PayrollService {

    private final PayrollRepo payrollRepo;

    @Autowired
    public PayrollService(PayrollRepo payrollRepo) {
        this.payrollRepo = payrollRepo;
    }

    // Methods for CRUD operations
    public Payroll savePayroll(Payroll payroll) {
        return payrollRepo.save(payroll);
    }

    public List<Payroll> getAllPayrolls() {
        return payrollRepo.findAll();
    }

    public Optional<Payroll> getPayrollById(Long id) {
        return payrollRepo.findById(id);
    }

    // Other methods as required
}
