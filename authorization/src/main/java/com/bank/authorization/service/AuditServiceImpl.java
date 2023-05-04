package com.bank.authorization.service;

import com.bank.authorization.DTO.AuditDTO;
import com.bank.authorization.entity.Audit;
import com.bank.authorization.entity.User;
import com.bank.authorization.repository.AuditRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class AuditServiceImpl implements AuditService {
    @Autowired
    private AuditRepository auditRepository;
    @Autowired
    private ModelMapper modelMapper;

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Timed(value = "getById.time", description = "Time taken to get Audit details by id")
    @Counted(value = "getById.count", description = "Number of times getById method has been invoked")
    public AuditDTO findById(Long id) {
        Audit audit = auditRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Audit not found"));
        return modelMapper.map(audit, AuditDTO.class);
    }

    @Override
    @Timed(value = "getAllAuditDetails.time", description = "Time taken to get all Audit details")
    @Counted(value = "getAllAuditDetails.calls",
            description = "Number of times get all Audit details method has been invoked")
    public List<AuditDTO> findAll() {
        List<Audit> audits = auditRepository.findAll();
        return audits.stream().map(audit -> modelMapper.map(audit, AuditDTO.class)).collect(Collectors.toList());
    }

    @Override
    @Timed(value = "create.time", description = "Time taken to create Audit details")
    @Counted(value = "create.count", description = "Number of times create method has been invoked")
    public void createAudit(User user, String operationType) {
        try {
            String entityJSON = objectMapper.writeValueAsString(user);
            Audit audit = new Audit();
            audit.setEntityType(user.getClass().getName());
            audit.setOperationType(operationType);
            audit.setEntityJSON(entityJSON);
            audit.setCreatedBy("system");
            audit.setCreatedAt(Timestamp.from(Instant.now()));

            entityManager.persist(audit);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
