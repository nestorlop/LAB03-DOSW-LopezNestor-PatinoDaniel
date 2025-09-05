package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.Account;
import edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify.Transaction;

public class TransactionTest {

    private Transaction transaction;
    private Account validAccount;
    
    
    @BeforeEach
    public void setUp(){
        transaction = new Transaction(10.56);
        validAccount = new Account("0100000002", 100.20);    
    }

    @Test
    public void shouldMadeDeposit(){
        transaction.makeDeposit(validAccount, transaction.getTransactionAmount());
        assertEquals(validAccount.getBalance(), 110.76);
    }

    @Test
    public void shouldNotMadeTransaction(){

    }
    
}
