package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify;

import java.util.ArrayList;

public class AccountManagement {

    private ArrayList<Account> accounts;
    private AccountValidator validator;

    public AccountManagement(ArrayList<Account> accounts) {
        this.accounts = accounts;
        this.validator = new AccountValidator();
    }

    public Account createAccount(String accountId) throws BankifyException {
        if (!validator.validateAccount(accountId)) {
            throw new BankifyException(BankifyException.INVALID_ACCOUNT_ID);
        }

        for (Account acc : accounts) {
            if (acc.getAccountId().equals(accountId)) {
                throw new BankifyException("Account already exists");
            }
        }

        Account newAccount = new Account(accountId, 0);
        accounts.add(newAccount);
        return newAccount;
    }

    public void deleteAccount(Account account) throws BankifyException {
    if (account == null || !accounts.contains(account)) {
        throw new BankifyException(BankifyException.ACCOUNT_NOT_FOUND);
    }
    accounts.remove(account);
    }


    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
