package com.bank.authorization.controller;

import com.bank.authorization.entity.Audit;
import com.bank.authorization.repository.AuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("audits")
public class AuditController {

    private final AuditRepository auditRepository;

    @Autowired
    public AuditController(AuditRepository auditRepository) {
        this.auditRepository = auditRepository;
    }

    @GetMapping
    public ResponseEntity<List<Audit>> getAllAudits() {
        List<Audit> audits = auditRepository.findAll();
        return new ResponseEntity<>(audits, HttpStatus.OK);
    }

}
