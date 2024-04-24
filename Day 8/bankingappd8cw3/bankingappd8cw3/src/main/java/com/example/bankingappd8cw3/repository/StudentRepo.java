package com.example.bankingappd8cw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bankingappd8cw3.model.Student;
//import com.examly.bankingappd8cw3.model.Student;
import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    List<Student> findByMarksGreaterThan(int mark);

    List<Student> findByMarksLessThan(int mark);

}
