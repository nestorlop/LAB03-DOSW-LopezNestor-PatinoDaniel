package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.Account;
import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.AccountManagement;
import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.BankifyException;
import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.AccountManagement;

public class AccountManagementTest {

    private AccountManagement accountManagement;
    private Account testAccount;
    private Account invalidAccount;

    @BeforeEach
    public void setUp(){
        testAccount = new Account("01000000001", 0.0);
        invalidAccount = new Account("01000000010", 0.1);
        accountManagement = new AccountManagement(new ArrayList<Account>());
    }


    @Test
    public void createAccountShouldCreate() throws BankifyException{
        Account newAccount = accountManagement.createAccount("0100000002");

        assertEquals("0100000002", newAccount.getAccountId());
        assertEquals(0, newAccount.getBalance());

    }

    @Test
    public void createAccountShouldThrowException() throws BankifyException{
        assertThrows(BankifyException.class, () -> accountManagement.createAccount("0100000002"));    
    }

    @Test
    public void deleteAccountShouldDelete() throws BankifyException{
        Account account = accountManagement.createAccount("0200000004");
        accountManagement.deleteAccount(account);
        assertThrows(BankifyException.class, () -> accountManagement.createAccount(account.getAccountId()));
    }


    @Test
    public void deleteAccountShouldThrowException(){
        BankifyException ex = assertThrows(BankifyException.class, () -> accountManagement.deleteAccount(invalidAccount.getAccountId()));

        assertEquals("The account doesn't exist", ex.getMessage());
    }

}
