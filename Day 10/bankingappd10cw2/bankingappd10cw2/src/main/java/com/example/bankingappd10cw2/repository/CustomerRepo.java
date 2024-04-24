// CustomerRepo.java
package com.example.bankingappd10cw2.repository;

import com.example.bankingappd10cw2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    @Query("SELECT c FROM Customer c WHERE c.city = :city")
    List<Customer> findByCity(String city);

    // Add other query methods for PUT and additional GET operations
}
