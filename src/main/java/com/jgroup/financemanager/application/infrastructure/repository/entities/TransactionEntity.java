package com.jgroup.financemanager.application.infrastructure.repository.entities;

import com.jgroup.financemanager.application.domain.enums.CategoryEnum;
import com.jgroup.financemanager.application.domain.enums.TypeTransactionEnum;
import com.jgroup.financemanager.application.domain.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "transactions")
@Getter
@Setter
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private LocalDate date;
    private Double value;
    @Enumerated(EnumType.STRING)
    private TypeTransactionEnum typeTransaction;
    private CategoryEnum category;
    private User user;
}
