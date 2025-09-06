package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.agilismo;


import java.util.Arrays;
import java.util.List;

public final class Fibonacci {
private Fibonacci() {}
 static List<Integer> numerosSerie = Arrays.asList(0,1,3,5,8,13,21,34);


public static boolean estaEnLaSerie(int v){ return numerosSerie.contains(v); }
}
