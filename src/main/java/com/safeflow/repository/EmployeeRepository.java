package com.safeflow.repository;

import com.safeflow.domain.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAllByUserId(Long userId);

}
