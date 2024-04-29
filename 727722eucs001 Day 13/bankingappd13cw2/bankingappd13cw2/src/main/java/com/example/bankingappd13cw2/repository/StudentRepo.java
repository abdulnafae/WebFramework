package com.example.bankingappd13cw2.repository;

import com.example.bankingappd13cw2.model.Student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByDepartmentDepartmentId(int departmentId);
}
