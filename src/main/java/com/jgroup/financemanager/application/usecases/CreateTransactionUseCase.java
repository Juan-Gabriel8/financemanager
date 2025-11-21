package com.jgroup.financemanager.application.usecases;

import com.jgroup.financemanager.application.domain.model.Transaction;
import com.jgroup.financemanager.application.domain.service.TransactionService;
import com.jgroup.financemanager.application.dto.TransactionDTO;
import com.jgroup.financemanager.application.ports.input.TransactionInputPort;
import com.jgroup.financemanager.application.ports.output.TransactionOutputPort;
import org.springframework.stereotype.Component;

public class CreateTransactionUseCase implements TransactionInputPort {

    private final TransactionOutputPort transactionOutputPort;
    private final TransactionService transactionService;

    public CreateTransactionUseCase(TransactionOutputPort transactionOutputPort, TransactionService transactionService) {
        this.transactionOutputPort = transactionOutputPort;
        this.transactionService = transactionService;
    }

    @Override
    public Transaction create(TransactionDTO dto) {
        Transaction transaction = transactionService.create(dto);
        return transactionOutputPort.save(transaction);
    }
}
