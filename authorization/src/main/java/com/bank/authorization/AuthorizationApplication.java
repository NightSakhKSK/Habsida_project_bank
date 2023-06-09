package com.bank.authorization;

import com.bank.authorization.listener.AuditUserListener;
import com.bank.authorization.service.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagement
public class AuthorizationApplication {
    @Autowired
    private AuditService auditService;

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        AuditUserListener.setAuditService(auditService);
    }
    public static void main(String[] args) {
        SpringApplication.run(AuthorizationApplication.class, args);
    }
}
