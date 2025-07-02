package com.safeflow.service;

import com.safeflow.domain.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();
    Employee createEmployee(Employee employee);
    List<Employee> getUserById(Long id);

}
