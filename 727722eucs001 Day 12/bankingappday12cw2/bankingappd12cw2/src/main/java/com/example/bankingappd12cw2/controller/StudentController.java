package com.example.bankingappd12cw2.controller;

import com.example.bankingappd12cw2.model.Student;
import com.example.bankingappd12cw2.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/inner-join")
    public ResponseEntity<List<Student>> getStudentsInnerJoin() {
        List<Student> students = studentService.getStudentsInnerJoin();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping("/left-outer-join")
    public ResponseEntity<List<Student>> getStudentsLeftOuterJoin() {
        List<Student> students = studentService.getStudentsLeftOuterJoin();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
}
