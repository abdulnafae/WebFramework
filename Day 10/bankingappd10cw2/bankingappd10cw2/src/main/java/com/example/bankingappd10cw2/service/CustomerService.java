// CustomerService.java
package com.example.bankingappd10cw2.service;

import com.example.bankingappd10cw2.model.Customer;
import com.example.bankingappd10cw2.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    public Optional<Customer> getCustomerById(int customerId) {
        return customerRepo.findById(customerId);
    }

    public List<Customer> getCustomersByCity(String city) {
        return customerRepo.findByCity(city);
    }

    // Implement methods for other CRUD operations
}
