package com.bank.service;

import com.bank.entity.Audit;

import java.util.List;

public interface AuditService {
    Audit findById(Long id);
    List<Audit> findByEntityType(String entityType);
    List<Audit> findByOperationType(String operationType);
    Audit save(Audit audit);
    void deleteById(Long id);
    List<Audit> findAll();
}
