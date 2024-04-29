package com.example.bankingappd13cw2.service;

import com.example.bankingappd13cw2.model.Student;
import com.example.bankingappd13cw2.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public List<Student> getStudentsByDepartmentId(int departmentId) {
        return studentRepo.findByDepartmentDepartmentId(departmentId);
    }

    public Student getStudentById(int studentId) {
        return studentRepo.findById(studentId).orElse(null);
    }
}
