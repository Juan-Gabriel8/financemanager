package com.jgroup.financemanager.application.infrastructure.repository;

import com.jgroup.financemanager.application.domain.model.Transaction;
import com.jgroup.financemanager.application.ports.output.TransactionOutputPort;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepositoryimpl implements TransactionOutputPort {

    private final JpaTransactionRepository jpaTransactionRepository;

    public TransactionRepositoryimpl(JpaTransactionRepository jpaTransactionRepository) {
        this.jpaTransactionRepository = jpaTransactionRepository;
    }

    @Override
    public Transaction save(Transaction transaction) {
        return jpaTransactionRepository.save(transaction);
    }
}
