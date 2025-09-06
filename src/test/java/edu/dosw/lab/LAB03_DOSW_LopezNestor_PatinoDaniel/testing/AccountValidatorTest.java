package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.AccountValidator;

public class AccountValidatorTest {
    
    private AccountValidator accountValidator;

    @BeforeEach
    public void setUp() {
        accountValidator = new AccountValidator();
    }

    @Test
    public void shouldValidateAccount() {
        assertTrue(accountValidator.validateAccount("0100000001"));
    }

    @Test
    public void shouldNotValidateAccountWithFewDigits() {
        assertFalse(accountValidator.validateAccount("12345"));
    }

    @Test
    public void shouldNotValidateAccountWithWrongBankCode() {
        assertFalse(accountValidator.validateAccount("9900000001"));
    }
}
