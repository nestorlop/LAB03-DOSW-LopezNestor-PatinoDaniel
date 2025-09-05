package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify;

import java.util.ArrayList;

public class Account {

    private String accountId;
    private double balance;
    private AccountValidator accountValidator;
    private AccountManagement accountManagment;
    private ArrayList<Movement> movements;
    private Bank bank;

    public Account(String accountId, double balance){
        this.accountId = accountId;
        this.balance = balance;
        this.movements = new ArrayList<>();
        accountValidator = new AccountValidator();
        accountManagment = new AccountManagement();
    } 

    public String getAccountId(){
        return accountId;
    }

    public double getBalance(){
        return balance;
    }

    public ArrayList<Movement> getMovements(){
        return movements;
    }
    
}
