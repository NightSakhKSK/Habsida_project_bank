package com.bank.authorization.service;

import com.bank.authorization.DTO.AuditDTO;
import com.bank.authorization.entity.Audit;
import com.bank.authorization.entity.User;

import java.math.BigInteger;
import java.util.List;

public interface AuditService {
    AuditDTO findById(Long id);

    List<AuditDTO> findAll();

    void createAudit(User user, String operationType);
}

