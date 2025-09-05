package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.Account;
import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.AccountManagement;
import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.BankifyException;
import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.AccountManagement;

public class AccountManagementTest {

    private AccountManagement accountManagement;
    private Account testAccount;

    @BeforeEach
    public void setUp(){
        testAccount = new Account("01000000001", 0.0);
        accountManagement = new AccountManagement();
    }


    @Test
    public void createAccountShouldCreate(){
        Account newAccount = accountManagement.createAccount();

        assertEquals(0100000002, newAccount.getAccountId());
        assertEquals(0, newAccount.getBalance());

    }

    @Test
    public void createAccountShouldThrowException(){
        Account newAccount = accountManagement.createAccount();

        assertThrows(BankifyException.class, () -> {newAccount();});
    }

    @Test
    public void deleteAccountShouldDelete(){
        accountManagement.deleteAccount();
        assertEquals(null, testAccount.getAccountId());
    }

    @Test
    public void deleteAccountShouldThrowException(){
        accountManagement.deleteAccount();

        String message = assertThrows(BankifyException.class, () -> {accountManagement.deleteAccount()});
        assertEquals("The account doesn't exist", message);

    }
    
}
