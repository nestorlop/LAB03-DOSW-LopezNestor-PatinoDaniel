package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify;

public class AccountValidator {

    public boolean validateAccount(String accountId) {
        if (accountId == null || accountId.isEmpty()) {
            return false;
        }
        if (!accountId.matches("\\d{10}")) {
            return false;
        }
        String bankCode = accountId.substring(0, 2);
        return bankCode.equals(Bank.BANCOLOMBIA.getCode()) ||
               bankCode.equals(Bank.DAVIVIENDA.getCode());
    }
}
