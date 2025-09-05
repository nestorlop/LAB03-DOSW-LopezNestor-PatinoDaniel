package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify;

import java.util.ArrayList;

public class AccountManagement {

    private ArrayList<Account> accounts;
    private AccountValidator validator;

    public AccountManagement(ArrayList<Account> accounts) {
        this.accounts = accounts;
        this.validator = new AccountValidator();
    }

    public Account createAccount(String accountId) throws BankifyException{
        Account newAccount = new Account(accountId, 0);
        if(!validator.validateAccount(newAccount.getAccountId())){
            throw new BankifyException(BankifyException.INVALID_ACCOUNT_ID);
        }
        accounts.add(newAccount);
        return newAccount;
    }
    
    public void deleteAccount(Account account) throws BankifyException{
        if(account != null){
            accounts.remove(account);
        } else {
            throw new BankifyException(BankifyException.ACCOUNT_NOT_FOUND);
        } 
    }

}
