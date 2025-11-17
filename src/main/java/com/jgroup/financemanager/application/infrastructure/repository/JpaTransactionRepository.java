package com.jgroup.financemanager.application.infrastructure.repository;

import com.jgroup.financemanager.application.domain.model.Transaction;
import com.jgroup.financemanager.application.infrastructure.repository.entities.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaTransactionRepository extends JpaRepository<TransactionEntity, UUID> {
}
