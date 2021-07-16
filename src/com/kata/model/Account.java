package com.kata.model;

import com.kata.exception.NotEnoughFundsException;
import com.kata.model.enums.OperationType;

import java.util.ArrayList;
import java.util.List;

public final class Account {

    private static Account instance;
    private double balance = 0.0;
    private List<AccountStatement> account_statements = new ArrayList<>();

    private Account() {
    }

    public double getBalance() {
        return balance;
    }

    public static synchronized Account getInstance() {
        if (instance == null) {
            instance = new Account();
        }
        return instance;
    }

    public void saveMoney(double money) {
        this.balance += money;
        AccountStatement account_statement = new AccountStatement(OperationType.SAVING, this.balance, money);
        account_statements.add(account_statement);
    }

    public void withdrawMoney(double money) throws NotEnoughFundsException {
        if (this.balance - money > 0) {
            balance -= money;
            AccountStatement account_statement = new AccountStatement(OperationType.WITHDRAWAL, this.balance, money);
            account_statements.add(account_statement);
        } else {
            throw new NotEnoughFundsException("Not Enough Funds Please Save Before !");
        }
    }

    public void logger() {
        account_statements.forEach(
                accountStatement -> System.out.println(accountStatement.toString())
        );
    }


}
