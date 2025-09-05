package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.testing;

import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.BankifyException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankifyExceptionTest {

    @Test
    public void shouldThrowUserNotFoundMessage() {
        BankifyException ex = new BankifyException(BankifyException.USER_NOT_FOUND);
        assertEquals("The user cannot be found", ex.getMessage());
    }

    @Test
    public void shouldThrowAccountNotFoundMessage() {
        BankifyException ex = new BankifyException(BankifyException.ACCOUNT_NOT_FOUND);
        assertEquals("The account doesn't exist", ex.getMessage());
    }

    @Test
    public void shouldThrowInvalidAccountMessage() {
        BankifyException ex = new BankifyException(BankifyException.INVALID_ACCOUNT_ID);
        assertEquals("The account id that you provide doesn't comply with the requirements", ex.getMessage());
    }
    @Test
    public void shouldThrowCustomMessage() {
        String customMessage = "Custom error message";
        BankifyException ex = new BankifyException(customMessage);
        assertEquals(customMessage, ex.getMessage());
    }

    @Test
    public void shouldInheritFromException() {
        BankifyException ex = new BankifyException("Test");
        assertTrue(ex instanceof Exception);
    }
}
