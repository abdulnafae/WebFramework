package com.example.bankingappd8cw3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.examly.bankingappd8cw3.model.Student;
import com.example.bankingappd8cw3.model.Student;
import com.example.bankingappd8cw3.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public boolean post(Student student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<Student> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<Student> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
