package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.bankify;

public enum Bank {
    DAVIVIENDA("01"),
    BANCOLOMBIA("02");

    private final String code;

    Bank(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }
    
}
