package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.Account;
import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.AccountManagement;
import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.AccountValidator;
import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.BankifyException;

public class AccountValidatorTest {
    
    private Account testAccount;
    private AccountValidator accountValidator;
    private Account invalidAccount;
    private Account exceptionAccount;

    @BeforeEach
    public void setUp(){
        testAccount = new Account("01000000001", 0.0);
        invalidAccount = new Account("3810102951", 10.5);
        exceptionAccount = new Account("9487218937219387129387389", -1000.0);
        accountValidator = new AccountValidator();
    }


    @Test
    public void shouldValidateAccount(){
        boolean validate  = accountValidator.validateAccount(testAccount.getAccountId());
        assertTrue(validate);
    }

    @Test
    public void shouldNotValidateAccount(){
        boolean validate  = accountValidator.validateAccount(invalidAccount.getAccountId());
        assertTrue(validate);
    }

    @Test
    public void createAccountShouldThrowException(){
        assertThrows(BankifyException.class, () -> {accountValidator.validateAccount(invalidAccount.getAccountId());
});

    }
}
