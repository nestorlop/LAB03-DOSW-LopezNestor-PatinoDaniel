package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify;

public class AccountValidator {
    
    public boolean validateAccount(String accountId){
        String[] digits = accountId.split("");
        if(digits.length != 10) return false;
        else if(Bank.BANCOLOMBIA.getCode().equals(digits[0] + digits[1]) || Bank.DAVIVIENDA.getCode().equals(digits[0] + digits[1])) return false;

        return true;
    }
}
