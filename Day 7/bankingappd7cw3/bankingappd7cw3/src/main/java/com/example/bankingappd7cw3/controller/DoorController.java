package com.example.bankingappd7cw3.controller;

import com.example.springapp.model.Door;
import com.example.springapp.service.DoorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/door")
public class DoorController {

    @Autowired
    private DoorService doorService;

    @PostMapping
    public ResponseEntity<Door> createDoor(@RequestBody Door door) {
        Door createdDoor = doorService.createDoor(door);
        return new ResponseEntity<>(createdDoor, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Door>> getAllDoors() {
        List<Door> doors = doorService.getAllDoors();
        return new ResponseEntity<>(doors, HttpStatus.OK);
    }

    @GetMapping("/{doorId}")
    public ResponseEntity<Door> getDoorById(@PathVariable int doorId) {
        Optional<Door> door = doorService.getDoorById(doorId);
        return door.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/accesstype/{accessType}")
    public ResponseEntity<List<Door>> getDoorsByAccessType(@PathVariable String accessType) {
        List<Door> doors = doorService.getDoorsByAccessType(accessType);
        return new ResponseEntity<>(doors, HttpStatus.OK);
    }
}
