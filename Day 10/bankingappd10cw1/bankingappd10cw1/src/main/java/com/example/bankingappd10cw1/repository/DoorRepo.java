// DoorRepo.java
package com.example.bankingappd10cw1.repository;

import com.example.bankingappd10cw1.model.Door;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoorRepo extends JpaRepository<Door, Integer> {

    @Query("SELECT d FROM Door d WHERE d.color = :color")
    List<Door> findByColor(String color);

    // Add other query methods for PUT, DELETE, and additional GET operations as needed
}
