package com.jgroup.financemanager.application.infrastructure.repository;

import com.jgroup.financemanager.application.domain.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaTransactionRepository extends JpaRepository<Transaction, String> {
}
