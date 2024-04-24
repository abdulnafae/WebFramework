// Student.java
package com.example.bankingappd11cw2.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudentIDCard studentIDCard;

    // Constructors, getters, and setters
}

// StudentIDCard.java
package com.examly.springapp.model;

import javax.persistence.*;

@Entity
public class StudentIDCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardNumber;

    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    // Constructors, getters, and setters
}
