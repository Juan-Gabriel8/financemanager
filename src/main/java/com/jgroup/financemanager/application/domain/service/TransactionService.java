package com.jgroup.financemanager.application.domain.service;

import com.jgroup.financemanager.application.domain.enums.TypeTransactionEnum;
import com.jgroup.financemanager.application.domain.model.Transaction;
import com.jgroup.financemanager.application.dto.TransactionDTO;

public class TransactionService {
    public Transaction create(TransactionDTO dto) {
        TypeTransactionEnum type = TypeTransactionEnum.valueOf(dto.getTypeTransaction().toUpperCase());
        return new Transaction(dto.getDate(), dto.getValue(), type, dto.getCategoryEnum(), dto.getUser());
    }
}
