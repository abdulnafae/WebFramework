
package com.example.bankingappd7cw3.repository;

import com.example.springapp.model.Door;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoorRepo extends JpaRepository<Door, Integer> {
    List<Door> findByAccessType(String accessType);
}
