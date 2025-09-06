package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.testing;

import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.Account;
import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.AccountManagement;
import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.BankifyException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AccountManagementTest {

    private AccountManagement accountManagement;

    @BeforeEach
    public void setUp() {
        accountManagement = new AccountManagement(new ArrayList<>());
    }

    @Test
    public void shouldCreateAccountSuccessfully() throws BankifyException {
        Account account = accountManagement.createAccount("0100000001");
        assertNotNull(account);
        assertEquals("0100000001", account.getAccountId());
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void shouldThrowExceptionWhenAccountIdInvalid() {
        BankifyException exception = assertThrows(
                BankifyException.class,
                () -> accountManagement.createAccount("9900000001")
        );
        assertEquals(BankifyException.INVALID_ACCOUNT_ID, exception.getMessage());
    }

    @Test
    public void shouldDeleteExistingAccount() throws BankifyException {
        Account account = accountManagement.createAccount("0200000002");
        accountManagement.deleteAccount(account);

        BankifyException exception = assertThrows(
                BankifyException.class,
                () -> accountManagement.deleteAccount(account)
        );
        assertEquals(BankifyException.ACCOUNT_NOT_FOUND, exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionWhenDeletingNullAccount() {
        BankifyException exception = assertThrows(
                BankifyException.class,
                () -> accountManagement.deleteAccount(null)
        );
        assertEquals(BankifyException.ACCOUNT_NOT_FOUND, exception.getMessage());
    }

    @Test
    public void shouldCreateMultipleAccounts() throws BankifyException {
        Account account1 = accountManagement.createAccount("0100000003");
        Account account2 = accountManagement.createAccount("0200000004");

        assertNotEquals(account1.getAccountId(), account2.getAccountId());
        assertEquals(0.0, account1.getBalance());
        assertEquals(0.0, account2.getBalance());
    }

    @Test
    public void shouldSetBalanceCorrectly() throws BankifyException {
        Account account = accountManagement.createAccount("0100000005");
        account.setBalance(500.0);
        assertEquals(500.0, account.getBalance());
    }
}
