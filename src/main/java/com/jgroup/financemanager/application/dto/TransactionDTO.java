package com.jgroup.financemanager.application.dto;

import com.jgroup.financemanager.application.domain.enums.CategoryEnum;
import com.jgroup.financemanager.application.domain.enums.TypeTransactionEnum;
import com.jgroup.financemanager.application.domain.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TransactionDTO {
    private LocalDate date;
    private Double amount;
    private TypeTransactionEnum typeTransaction;
    private CategoryEnum categoryEnum;
    private User user;
}
