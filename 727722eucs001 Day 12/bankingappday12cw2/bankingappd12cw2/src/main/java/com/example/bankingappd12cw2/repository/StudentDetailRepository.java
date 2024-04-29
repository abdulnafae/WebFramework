package com.example.bankingappd12cw2.repository;

import com.example.bankingappd12cw2.model.StudentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDetailRepository extends JpaRepository<StudentDetail, Integer> {
}
