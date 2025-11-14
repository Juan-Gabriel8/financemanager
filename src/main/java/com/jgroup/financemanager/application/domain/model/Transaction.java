package com.jgroup.financemanager.application.domain.model;

import com.jgroup.financemanager.application.domain.enums.CategoryEnum;
import com.jgroup.financemanager.application.domain.enums.TypeTransactionEnum;
import com.jgroup.financemanager.application.domain.model.User;

import java.time.LocalDate;

public class Transaction {

    private String id;

    private LocalDate date;
    private Double value;
    private String typeTransaction;
    private CategoryEnum category;
    private User user;

    public Transaction() {

    }

    public Transaction(String id, LocalDate date, Double value, String typeTransaction, CategoryEnum category, User user) {
        if (value <= 0) {
            throw new IllegalArgumentException("Valor deve ser positivo");
        }
        this.id = id;
        this.date = date;
        this.value = value;
        this.typeTransaction = typeTransaction;
        this.category = category;
        this.user = user;
    }

    public Transaction(LocalDate date, Double value, TypeTransactionEnum typeTransactionEnum, CategoryEnum categoryEnum, User user) {
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

    public void setId(String id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
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

    public void setUser(User user) {
        this.user = user;
    }
}
