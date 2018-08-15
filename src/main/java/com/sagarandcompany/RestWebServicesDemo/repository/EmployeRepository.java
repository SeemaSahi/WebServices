package com.sagarandcompany.RestWebServicesDemo.repository;

import com.sagarandcompany.RestWebServicesDemo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employee, Long> {
//    @Query("select * from Employee where id=:ss")
//    public Employee findXyz(@Param("id") Long id);
}
