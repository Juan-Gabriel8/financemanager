package com.jgroup.financemanager.application.infrastructure.repository.mapper;

import com.jgroup.financemanager.application.domain.model.Transaction;
import com.jgroup.financemanager.application.infrastructure.repository.entities.TransactionEntity;

public class TransactionMapper {

    public static TransactionEntity toEntity(Transaction domain) {
        TransactionEntity entity = new TransactionEntity();
        entity.setId(domain.getId());
        entity.setDate(domain.getDate());
        entity.setValue(domain.getValue());
        entity.setTypeTransaction(domain.getTypeTransaction());
        entity.setCategory(domain.getCategory());
        entity.setUser(domain.getUser());
        return entity;
    }

    public static Transaction toDomain(TransactionEntity entity) {
        return new Transaction(
                entity.getId(),
                entity.getDate(),
                entity.getValue(),
                entity.getTypeTransaction(),
                entity.getCategory(),
                entity.getUser()
        );

    }
}
