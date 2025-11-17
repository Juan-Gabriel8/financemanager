package com.jgroup.financemanager.application.domain.model;

import com.jgroup.financemanager.application.domain.enums.CategoryEnum;
import com.jgroup.financemanager.application.domain.enums.TypeTransactionEnum;

import java.time.LocalDate;

public class Transaction {

    private final String id;
    private LocalDate date;
    private Double value;
    private TypeTransactionEnum typeTransaction;
    private CategoryEnum category;
    private User user;

    public Transaction(LocalDate date, Double value, TypeTransactionEnum typeTransactionEnum, CategoryEnum categoryEnum, User user) {
        if (value <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }
        this.id = java.util.UUID.randomUUID().toString();
        this.date = date;
        this.value = value;
        this.typeTransaction = typeTransactionEnum;
        this.category = categoryEnum;
        this.user = user;
    }


    public Transaction(String id, LocalDate date, Double value, TypeTransactionEnum typeTransaction,
                       CategoryEnum category, User user) {

        if (value <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }

        this.id = id;  // ← Usado quando reconstruindo do repositório (padrão DDD)
        this.date = date;
        this.value = value;
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

    public String getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
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
