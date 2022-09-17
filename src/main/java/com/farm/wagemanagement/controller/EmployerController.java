package com.farm.wagemanagement.controller;

import com.farm.wagemanagement.model.Employer;
import com.farm.wagemanagement.service.EmployerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@RequestMapping("/api/employer")
public class EmployerController {

    @Autowired
    private EmployerManager employerManager;

    @GetMapping("/{id}")
    public ResponseEntity<Employer> getEmployerById(@PathVariable String id) {
        Employer employer = employerManager.findById(Long.parseLong(id));
        return ResponseEntity.ok(employer);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employer>> getAllEmployer() {
        List<Employer> employers = employerManager.findAll();
        return ResponseEntity.ok(employers);
    }

    @PostMapping("/create")
    public ResponseEntity<Employer> createEmployer(@RequestBody Employer employer) {
        Employer employer1 = employerManager.saveEmployer(employer);
        return ResponseEntity.ok(employer1);
    }

}
