package com.farm.wagemanagement.repository;

import com.farm.wagemanagement.model.TODO.IncomeSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentModeRepository extends JpaRepository<IncomeSource.PaymentMode,Long> {
}
