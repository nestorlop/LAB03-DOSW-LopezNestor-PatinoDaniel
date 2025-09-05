package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;;

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
        accountManagement = new AccountManagement();
    }


    @Test
    public void createAccountShouldCreate(){
        Account newAccount = accountManagement.createAccount();

        assertEquals("0100000002", newAccount.getAccountId());
        assertEquals(0, newAccount.getBalance());

    }

    @Test
    public void createAccountShouldThrowException(){
        assertThrows(BankifyException.class, () -> accountManagement.createAccount());    
    }

    @Test
    public void deleteAccountShouldDelete(){
        Account account = accountManagement.createAccount();
        accountManagement.deleteAccount(account);
        assertThrows(BankifyException.class, () -> accountManagement.getAccount(account.getAccountId()));
    }


    @Test
    public void deleteAccountShouldThrowException(){
        BankifyException ex = assertThrows(BankifyException.class, () -> accountManagement.deleteAccount(invalidAccount.getAccountId()));

        assertEquals("The account doesn't exist", ex.getMessage());
    }
        
}
