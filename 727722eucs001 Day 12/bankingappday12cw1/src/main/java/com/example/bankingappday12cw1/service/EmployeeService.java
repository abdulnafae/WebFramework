package com.example.bankingappday12cw1.service;

import com.example.bankingappday12cw1.model.Employee;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class EmployeeService<entityManager, entityManager> {
    private final EntityManager entityManager;

    public EmployeeService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Employee> getEmployeesInnerJoin() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

        Root<Employee> employee = cq.from(Employee.class);
        employee.fetch("address");

        return entityManager.createQuery(cq).getResultList();
    }

    public List<Employee> getEmployeesLeftOuterJoin() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);

        Root<Employee> employee = cq.from(Employee.class);
        employee.join("address");

        return entityManager.createQuery(cq).getResultList();
    }
}
