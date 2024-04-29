package com.example.bankingappd12cw2.model;

import org.hibernate.annotations.DialectOverride.GeneratedColumns;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import jakarta.persistence.GenerationType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;

@EntityScan
public class Student {
    @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudentDetail studentDetail;

    // Constructors, getters, and setters
    public Student() {}

    public Student(String name, int age, StudentDetail studentDetail) {
        this.name = name;
        this.age = age;
        this.studentDetail = studentDetail;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StudentDetail getStudentDetail() {
        return studentDetail;
    }

    public void setStudentDetail(StudentDetail studentDetail) {
        this.studentDetail = studentDetail;
    }
}
