package com.jgroup.financemanager.application.infrastructure.repository.entities;

import com.jgroup.financemanager.application.domain.enums.CategoryEnum;
import com.jgroup.financemanager.application.domain.enums.TypeTransactionEnum;
import com.jgroup.financemanager.application.domain.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "transactions")
@Getter
@Setter
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private LocalDate date;

    private Double amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_transaction")
    private TypeTransactionEnum typeTransaction;

    private CategoryEnum categoryEnum;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
