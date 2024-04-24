// DoorService.java
package com.example.bankingappd10cw1.service;

import com.example.bankingappd10cw1.model.Door;
import com.example.bankingappd10cw1.repository.DoorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoorService {

    @Autowired
    private DoorRepo doorRepo;

    public List<Door> getAllDoors() {
        return doorRepo.findAll();
    }

    public Optional<Door> getDoorById(int doorId) {
        return doorRepo.findById(doorId);
    }

    public List<Door> getDoorsByColor(String color) {
        return doorRepo.findByColor(color);
    }

    // Implement methods for other CRUD operations
}
