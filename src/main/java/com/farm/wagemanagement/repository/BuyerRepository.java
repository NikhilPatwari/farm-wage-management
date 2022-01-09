package com.farm.wagemanagement.repository;

import com.farm.wagemanagement.model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer,Long> {
}
