package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify;

public class BankifyException extends Exception {
    public static final String USER_NOT_FOUND  =  "The user cannot be found";
    public static final String ACCOUNT_NOT_FOUND = "The account doesn't exist";
    public static final String INVALID_ACCOUNT_ID = "The account id that you provide doesn't comply with the requirements";


    public BankifyException(String message){
        super(message);
    }
    
}
