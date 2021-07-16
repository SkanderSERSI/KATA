package com.kata.tests;

import com.kata.model.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AccountUT {

    private Account account;

    @Before
    public void setUp() {
        account = Account.getInstance();
    }

    @Test
    public void testWithdrawal() {
        account.saveMoney(50.0);
        account.withdrawMoney(2.0);
        assertEquals(account.getBalance(), 98.0, 1);
    }

    @Test
    public void testWithdrawalbad() {
        try {
            account.saveMoney(50.0);
            account.withdrawMoney(100.0);
        } catch (Exception e) {
            assertEquals(account.getBalance(), 50.0, 1);
        }
    }

    @Test
    public void testSaving() {
        account.saveMoney(50.0);
        assertEquals(account.getBalance(), 50.0, 1);
    }
}
