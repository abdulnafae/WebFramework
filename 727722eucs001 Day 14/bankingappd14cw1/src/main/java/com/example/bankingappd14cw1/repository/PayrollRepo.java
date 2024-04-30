package com.example.bankingappd14cw1.repository;

import com.example.bankingappd14cw1.model.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll, Long> {
}
