package com.bank.service;

import com.bank.entity.Audit;
import com.bank.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuditServiceImpl implements AuditService {
    private final AuditRepository auditRepository;

    @Autowired
    public AuditServiceImpl(AuditRepository auditRepository) {
        this.auditRepository = auditRepository;
    }

    @Override
    public Audit findById(Long id) {
        return auditRepository.findById(id).orElse(null);
    }

    @Override
    public List<Audit> findByEntityType(String entityType) {
        return auditRepository.findByEntityType(entityType);
    }

    @Override
    public List<Audit> findByOperationType(String operationType) {
        return auditRepository.findByOperationType(operationType);
    }

    @Override
    public Audit save(Audit audit) {
        return auditRepository.save(audit);
    }

    @Override
    public void deleteById(Long id) {
        auditRepository.deleteById(id);
    }

    @Override
    public List<Audit> findAll() {
        return auditRepository.findAll();
    }
}
