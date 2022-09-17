package com.farm.wagemanagement.service;

import com.farm.wagemanagement.model.Employer;

import java.util.List;

public interface EmployerManager {
    Employer findById(long id);

    List<Employer> findAll();

    Employer saveEmployer(Employer employer);
}
