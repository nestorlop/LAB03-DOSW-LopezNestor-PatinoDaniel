package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.testing;

import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    void shouldDepositCorrectly() {
        Account account = new Account("010000001", 500.0);
        Transaction transaction = new Transaction(200.0);
        transaction.makeDeposit(account, 200.0);
        assertEquals(700.0, account.getBalance());
    }

    @Test
    void shouldNotDepositNegativeAmount() {
        Account account = new Account("010000002", 500.0);
        Transaction transaction = new Transaction(200.0);
        transaction.makeDeposit(account, -100.0);
        assertEquals(500.0, account.getBalance());
    }
    @Test
    void shouldCreateTransactionWithCorrectAmount() {
        Transaction transaction = new Transaction(150.0);
        assertEquals(150.0, transaction.getTransactionAmount());
    }
    @Test
    void shouldHaveCurrentDate() {
        Transaction transaction = new Transaction(100.0);
        assertNotNull(transaction.getDate());
    }
    @Test
    void shouldNotDepositZeroAmount() {
        Account account = new Account("010000001", 500.0);
        Transaction transaction = new Transaction(200.0);
        transaction.makeDeposit(account, 0.0);
        assertEquals(500.0, account.getBalance());
    }
    @Test
    void shouldHandleMultipleDeposits() {
        Account account = new Account("010000001", 500.0);
        Transaction transaction = new Transaction(200.0);
        
        transaction.makeDeposit(account, 100.0);
        assertEquals(600.0, account.getBalance());
        
        transaction.makeDeposit(account, 50.0);
        assertEquals(650.0, account.getBalance());
    }
    @Test
    void shouldActuallyTestMakeDepositMethod() {
        Account account = new Account("010000001", 500.0);
        Transaction transaction = new Transaction(200.0);
        transaction.makeDeposit(account, 300.0);
        assertEquals(800.0, account.getBalance());
    }

    @Test
    void shouldTestMakeDepositWithDifferentAmounts() {
        Account account = new Account("010000001", 100.0);
        Transaction transaction = new Transaction(0.0);
        
        transaction.makeDeposit(account, 50.0);
        assertEquals(150.0, account.getBalance());
        
        transaction.makeDeposit(account, 25.0);
        assertEquals(175.0, account.getBalance());
    }
}
