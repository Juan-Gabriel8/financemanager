package com.jgroup.financemanager.application.domain.service;

import com.jgroup.financemanager.application.domain.model.Transaction;
import com.jgroup.financemanager.application.dto.TransactionDTO;

public class TransactionService {
    public Transaction create(TransactionDTO dto) {

        return new Transaction(
                dto.getDate(),
                dto.getAmount(),
                dto.getTypeTransaction(),
                dto.getCategoryEnum(),
                dto.getUser()
        );
    }
}
