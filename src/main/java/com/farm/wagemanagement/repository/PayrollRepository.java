package com.farm.wagemanagement.repository;

import com.farm.wagemanagement.model.PaymentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayrollRepository extends JpaRepository<PaymentHistory,Long> {
}
