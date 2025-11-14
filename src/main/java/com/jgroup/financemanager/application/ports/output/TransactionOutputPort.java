package com.jgroup.financemanager.application.ports.output;

import com.jgroup.financemanager.application.domain.model.Transaction;

public interface TransactionOutputPort {

    Transaction save(Transaction transaction);
}
