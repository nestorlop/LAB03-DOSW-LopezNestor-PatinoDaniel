package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.Simulacion;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class Votos {
    public ArrayList<String> miembros = new ArrayList<>();
    public Votos(ArrayList miembros){
        this.miembros = miembros;
    }
    public ArrayList getMiembros(){
        return miembros;
    }
     public boolean resultados(Map<String,Integer> votos){
     if (votos.isEmpty()) {
        return false;
     }
     Integer resultado = votos.values().iterator().next();  
     for ( Integer i : votos.values()) {
        if(!Objects.equals(resultado, i)){
            return false;
        }
     }
     return true;
    }
}