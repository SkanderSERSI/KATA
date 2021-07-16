package com.kata;

import com.kata.model.Account;

public class Main {

    public static void main(String[] args) {
        Account account = Account.getInstance();
        try {
            account.saveMoney(65.5);
            account.saveMoney(65.5);
            account.saveMoney(65.5);
            account.withdrawMoney(10000.6);
            account.logger();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
