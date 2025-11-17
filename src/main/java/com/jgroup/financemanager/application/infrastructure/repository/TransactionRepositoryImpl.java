package com.jgroup.financemanager.application.infrastructure.repository;

import com.jgroup.financemanager.application.domain.model.Transaction;
import com.jgroup.financemanager.application.infrastructure.repository.entities.TransactionEntity;
import com.jgroup.financemanager.application.infrastructure.repository.mapper.TransactionMapper;
import com.jgroup.financemanager.application.ports.output.TransactionOutputPort;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepositoryImpl implements TransactionOutputPort {

    private final JpaTransactionRepository jpaTransactionRepository;

    public TransactionRepositoryImpl(JpaTransactionRepository jpaTransactionRepository) {
        this.jpaTransactionRepository = jpaTransactionRepository;
    }

    @Override
    public Transaction save(Transaction transaction) {
        TransactionEntity entity = TransactionMapper.toEntity(transaction);
        TransactionEntity saved = jpaTransactionRepository.save(entity);
        return TransactionMapper.toDomain(saved);
    }
}
