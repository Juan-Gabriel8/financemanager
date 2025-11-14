package com.jgroup.financemanager.application.usecases;

import com.jgroup.financemanager.application.service.TransactionService;
import com.jgroup.financemanager.application.ports.output.TransactionOutputPort;

public class CreateTransactionUseCase {
    private final TransactionOutputPort repository;
    private final TransactionService transactionService;

    public CreateTransactionUseCase(TransactionOutputPort repository, TransactionService transactionService) {
        this.repository = repository;
        this.transactionService = transactionService;
    }


}
