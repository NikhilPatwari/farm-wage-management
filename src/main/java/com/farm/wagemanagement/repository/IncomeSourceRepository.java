package com.farm.wagemanagement.repository;

import com.farm.wagemanagement.model.IncomeSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeSourceRepository extends JpaRepository<IncomeSource,Long> {
}
