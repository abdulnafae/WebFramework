package com.example.bankingappd12cw2.service;

import com.example.bankingappd12cw2.model.Student;
import com.example.bankingappd12cw2.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class StudentService<EntityManager, CriteriaBuilder> {
    private final EntityManager entityManager;
    private final StudentRepository studentRepository;

    public StudentService(EntityManager entityManager, StudentRepository studentRepository) {
        this.entityManager = entityManager;
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudentsInnerJoin() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);

        Root<Student> student = cq.from(Student.class);
        student.fetch("studentDetail");

        return entityManager.createQuery(cq).getResultList();
    }

    public List<Student> getStudentsLeftOuterJoin() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);

        Root<Student> student = cq.from(Student.class);
        student.join("studentDetail");

        return entityManager.createQuery(cq).getResultList();
    }
}
