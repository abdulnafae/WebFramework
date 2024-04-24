
package com.example.bankingappd7cw3.service;
import com.example.springapp.model.Door;
import com.example.springapp.repository.DoorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoorService {

    @Autowired
    private DoorRepo doorRepo;

    public Door createDoor(Door door) {
        return doorRepo.save(door);
    }

    public List<Door> getAllDoors() {
        return doorRepo.findAll();
    }

    public Optional<Door> getDoorById(int doorId) {
        return doorRepo.findById(doorId);
    }

    public List<Door> getDoorsByAccessType(String accessType) {
        return doorRepo.findByAccessType(accessType);
    }
}
