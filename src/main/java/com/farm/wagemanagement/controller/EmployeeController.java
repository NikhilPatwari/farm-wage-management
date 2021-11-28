package com.farm.wagemanagement.controller;

import com.farm.wagemanagement.model.Employee;
import com.farm.wagemanagement.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeManager employeeManager;

    @GetMapping()
    public List<Employee> getAllEmployee(){
        return employeeManager.getAllEmployee();
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable String id){
        return employeeManager.getEmployeeById(id);
    }
    @PutMapping()
    public Employee editEmployee(@RequestBody Employee employee) {
        return employeeManager.editEmployee(employee);
    }
}
