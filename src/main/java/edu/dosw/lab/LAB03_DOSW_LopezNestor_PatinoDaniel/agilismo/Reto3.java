package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.agilismo;

import java.util.ArrayList;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de miembros del equipo: ");
        int cantidadMiembros = sc.nextInt();
        sc.nextLine(); 
        ArrayList<String> miembros = new ArrayList<>();
        for (int i = 0; i < cantidadMiembros; i++) {
            System.out.print("Ingrese el nombre del miembro #" + (i + 1) + ": ");
            String nombre = sc.nextLine();
            miembros.add(nombre);
        }
        System.out.print("\nIngrese el número de tareas/historias: ");
        int cantidadTareas = sc.nextInt();
        sc.nextLine();
        ArrayList<Tareas> tareas = new ArrayList<>();
        for (int i = 0; i < cantidadTareas; i++) {
            System.out.println("\n=== Tarea #" + (i + 1) + " ===");
            System.out.print("Nombre de la tarea: ");
            String nombreTarea = sc.nextLine();
            System.out.print("Descripción de la tarea: ");
            String descripcion = sc.nextLine();
            tareas.add(new Tareas(nombreTarea, descripcion));
        }
        PlaningPoker poker = new PlaningPoker(tareas, miembros);
        poker.iniciar();
    }
}
