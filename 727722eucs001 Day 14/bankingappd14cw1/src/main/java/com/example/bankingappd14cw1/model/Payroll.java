package com.example.bankingappd14cw1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payrollId;
    private double amount;
    private int noOfDaysWorked;

    public Payroll() {
    }

    public Payroll(double amount, int noOfDaysWorked) {
        this.amount = amount;
        this.noOfDaysWorked = noOfDaysWorked;
    }

    // Getters and Setters
    public Long getPayrollId() {
        return payrollId;
    }

    public void setPayrollId(Long payrollId) {
        this.payrollId = payrollId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNoOfDaysWorked() {
        return noOfDaysWorked;
    }

    public void setNoOfDaysWorked(int noOfDaysWorked) {
        this.noOfDaysWorked = noOfDaysWorked;
    }
}
