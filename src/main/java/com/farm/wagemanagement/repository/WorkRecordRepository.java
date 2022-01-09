package com.farm.wagemanagement.repository;

import com.farm.wagemanagement.model.WorkRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkRecordRepository extends JpaRepository<WorkRecord,Long> {
}
