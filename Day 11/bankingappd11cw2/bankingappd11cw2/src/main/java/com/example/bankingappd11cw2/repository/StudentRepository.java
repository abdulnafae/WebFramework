// StudentRepository.java
package com.examly.springapp.repository;

import com.examly.springapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

// StudentIDCardRepository.java
package com.examly.springapp.repository;

import com.examly.springapp.model.StudentIDCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentIDCardRepository extends JpaRepository<StudentIDCard, Long> {
}
