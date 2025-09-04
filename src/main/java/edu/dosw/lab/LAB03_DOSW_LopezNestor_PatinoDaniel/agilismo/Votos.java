package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.agilismo;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class Votos {
    private final ArrayList<String> miembros;

    public Votos(ArrayList<String> miembros) {
        this.miembros = miembros;
    }

    public ArrayList<String> getMiembros() {
        return miembros;
    }

    public boolean resultados(Map<String, Integer> votos) {
        if (votos.isEmpty()) return false;
        Integer primero = votos.values().iterator().next();

        for (Integer v : votos.values()) {
            if (!Objects.equals(primero, v)) {
                return false;
            }
        }
        return true;
    }
}
