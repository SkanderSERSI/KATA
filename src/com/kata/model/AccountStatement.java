package com.kata.model;

import com.kata.model.enums.OperationType;

import java.time.LocalDateTime;

public class AccountStatement {

    private static Long id = 1L;
    private LocalDateTime createdAt;
    private OperationType operation;
    private double balance;
    private double amount;

    public AccountStatement(OperationType operationType, double balance, double amount) {
        this.createdAt = LocalDateTime.now();
        this.operation = operationType;
        this.balance = balance;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "AccountStatement{" +
                "createdAt=" + createdAt +
                ", operation=" + operation +
                ", balance=" + balance +
                ", amount=" + amount +
                '}';
    }
}
