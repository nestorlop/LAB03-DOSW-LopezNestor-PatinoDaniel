package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify;

import java.util.ArrayList;

public class Client {

    private String name;
    private ArrayList<Account> accounts;
    
    public Client(String name){
        this.name = name;
        this.accounts = new ArrayList<>(); 
    }

    public String getName() {
        return name;
    }
    
    public ArrayList<Account> getAccounts(){
        return accounts;
    }

}
