package com.example.bankingappd12cw2.controller;

import com.example.bankingappd12cw2.model.StudentDetail;
import com.example.bankingappd12cw2.service.StudentDetailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentDetail")
public class StudentDetailController {
    private final StudentDetailService studentDetailService;

    public StudentDetailController(StudentDetailService studentDetailService) {
        this.studentDetailService = studentDetailService;
    }

    @PostMapping("/student/{id}")
    public ResponseEntity<StudentDetail> mapStudentDetailToStudent(@RequestBody StudentDetail studentDetail, @PathVariable int id) {
        StudentDetail mappedStudentDetail = studentDetailService.mapStudentDetailToStudent(studentDetail, id);
        return new ResponseEntity<>(mappedStudentDetail, HttpStatus.CREATED);
    }
}
