package com.farm.wagemanagement.repository;

import com.farm.wagemanagement.model.PaymentMode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentModeRepository extends JpaRepository<PaymentMode,Long> {
}
