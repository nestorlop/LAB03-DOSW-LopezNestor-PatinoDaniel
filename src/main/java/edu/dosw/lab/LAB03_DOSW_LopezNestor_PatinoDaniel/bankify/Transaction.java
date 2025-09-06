package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify;
import java.time.LocalDate;
public class Transaction {
    private LocalDate date;
    private double amount;
    public Transaction(double amount) {
        this.amount = amount;
        this.date = LocalDate.now();
    }

    public void makeDeposit(Account account, double amount) {
        if (amount <= 0) {
            return;
        }
        account.setBalance(account.getBalance() + amount);
    }

    public double getTransactionAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
}
