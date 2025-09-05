package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify;

import java.time.LocalDate;
import java.util.ArrayList;

public class Transaction {
    private LocalDate date;
    private double amount;
    private ArrayList<Account> accounts;

    public Transaction(double amount){
        this.amount = amount;
        this.date = LocalDate.now();
    }

    public void makeDeposit(Account account, double amount){
        accounts.stream()
                .filter(acc -> acc.getAccountId().equals(account.getAccountId()))
                .findFirst()
                .ifPresent(acc -> acc.setBalance(acc.getBalance() + amount));

    }

    public double getTransactionAmount(){
        return amount;
    }

}
