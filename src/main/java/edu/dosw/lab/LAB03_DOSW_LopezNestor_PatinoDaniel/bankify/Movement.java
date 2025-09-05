package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify;

import java.util.ArrayList;

public class Movement {

    private ArrayList<Transaction> transactions;

    public Movement(){
        this.transactions = new ArrayList<>();
    }

    public ArrayList<Transaction> getTransactions(){
        return transactions;
    }
    
}
