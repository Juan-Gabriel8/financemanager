package com.jgroup.financemanager.application.infrastructure.repository.mapper;

import com.jgroup.financemanager.application.domain.model.Transaction;
import com.jgroup.financemanager.application.domain.model.User;
import com.jgroup.financemanager.application.infrastructure.repository.entities.TransactionEntity;

public class TransactionMapper {

    public static TransactionEntity toEntity(Transaction domain) {
        TransactionEntity entity = new TransactionEntity();
        entity.setId(domain.getId());
        entity.setDate(domain.getDate());
        entity.setAmount(domain.getAmount());
        entity.setTypeTransaction(domain.getTypeTransaction());
        entity.setCategoryEnum(domain.getCategory());
        entity.setUser(UserMapper.toEntity(domain.getUser()));
        return entity;
    }

    public static Transaction toDomain(TransactionEntity entity) {
        User user = UserMapper.toDomain(entity.getUser());
        return new Transaction(
                entity.getId(),
                entity.getDate(),
                entity.getAmount(),
                entity.getTypeTransaction(),
                entity.getCategoryEnum()

                ,
                user
        );

    }
}
