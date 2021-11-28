package com.farm.wagemanagement.service;

import com.farm.wagemanagement.model.Employee;

import java.util.List;

public interface EmployeeManager{

    public List<Employee> getAllEmployee();

    public Employee getEmployeeById(String id);
}
