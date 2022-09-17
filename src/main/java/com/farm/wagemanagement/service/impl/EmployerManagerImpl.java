package com.farm.wagemanagement.service.impl;

import com.farm.wagemanagement.model.Employer;
import com.farm.wagemanagement.repository.EmployerRepository;
import com.farm.wagemanagement.service.EmployerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployerManagerImpl implements EmployerManager {

    @Autowired
    private EmployerRepository employerRepository;
    @Override
    public Employer findById(long id) {
        return employerRepository.findById(id).orElseThrow(() -> new RuntimeException("Employer Not found"));
    }

    @Override
    public List<Employer> findAll() {
        return employerRepository.findAll();
    }

    @Override
    public Employer saveEmployer(Employer employer) {
        return employerRepository.save(employer);
    }

}
