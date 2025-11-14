package com.jgroup.financemanager.application.ports.input;

import com.jgroup.financemanager.application.domain.model.Transaction;
import com.jgroup.financemanager.application.dto.TransactionDTO;

public interface TransactionInputPort {

    Transaction create(TransactionDTO dto);
}
