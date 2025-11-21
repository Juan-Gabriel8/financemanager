package com.jgroup.financemanager.application.domain.model;

import com.jgroup.financemanager.application.domain.enums.CategoryEnum;
import com.jgroup.financemanager.application.domain.enums.TypeTransactionEnum;

import java.time.LocalDate;
import java.util.UUID;

public class Transaction {

    private final UUID id;
    private LocalDate date;
    private Double amount;
    private TypeTransactionEnum typeTransaction;
    private CategoryEnum category;
    private User user;

    public Transaction(LocalDate date, Double amount, TypeTransactionEnum typeTransactionEnum, CategoryEnum categoryEnum, User user) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }
        this.id = java.util.UUID.randomUUID();
        this.date = date;
        this.amount = amount;
        this.typeTransaction = typeTransactionEnum;
        this.category = categoryEnum;
        this.user = user;
    }


    public Transaction(UUID id, LocalDate date, Double amount, TypeTransactionEnum typeTransaction,
                       CategoryEnum category, User user) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }

        this.id = id;  // ← Usado quando reconstruindo do repositório (padrão DDD)
        this.date = date;
        this.amount = amount;
        this.typeTransaction = typeTransaction;
        this.category = category;
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public UUID getId() {
        return id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public TypeTransactionEnum getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(TypeTransactionEnum typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser() {
        this.user = user;
    }
}
