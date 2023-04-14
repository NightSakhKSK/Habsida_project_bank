package com.bank.repository;

import com.bank.entity.Audit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuditRepository extends JpaRepository<Audit, Long> {
    List<Audit> findByEntityType(String entityType);
    List<Audit> findByOperationType(String operationType);
}
