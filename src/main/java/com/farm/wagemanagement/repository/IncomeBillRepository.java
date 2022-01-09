package com.farm.wagemanagement.repository;

import com.farm.wagemanagement.model.IncomeBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeBillRepository extends JpaRepository<IncomeBill,Long> {
}
