// DoorController.java
package com.example.bankingappd10cw1.Controller;

import com.example.bankingappd10cw1.model.Door;
import com.example.bankingappd10cw1.service.DoorService;
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
        // Implement creation logic
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/{doorId}")
    public ResponseEntity<Door> getDoorById(@PathVariable int doorId) {
        // Implement logic to retrieve a door by its ID
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/bycolor/{color}")
    public ResponseEntity<List<Door>> getDoorsByColor(@PathVariable String color) {
        // Implement logic to retrieve doors by color
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Implement other CRUD endpoints as specified

}
