package com.sagarandcompany.RestWebServicesDemo.repository;

import com.sagarandcompany.RestWebServicesDemo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employee, Long> {
}
