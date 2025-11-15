package com.jgroup.financemanager.application.infrastructure.controller;

import com.jgroup.financemanager.application.domain.model.Transaction;
import com.jgroup.financemanager.application.dto.TransactionDTO;
import com.jgroup.financemanager.application.ports.input.TransactionInputPort;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class TransactionController {

    private final TransactionInputPort transactionInputPort;

    public TransactionController(TransactionInputPort transactionInputPort) {
        this.transactionInputPort = transactionInputPort;
    }

    @PostMapping("/transaction")
    public Transaction create(@RequestBody TransactionDTO dto) {
        return transactionInputPort.create(dto);
    }
}
