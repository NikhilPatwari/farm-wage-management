package com.farm.wagemanagement.service.impl;

import com.farm.wagemanagement.model.Employee;
import com.farm.wagemanagement.repository.EmployeeRepository;
import com.farm.wagemanagement.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployee() {
          return employeeRepository.findAll();
    }
    @Override
    public Employee getEmployeeById(String id){
        return employeeRepository.getById(Long.parseLong(id));
    }
}
