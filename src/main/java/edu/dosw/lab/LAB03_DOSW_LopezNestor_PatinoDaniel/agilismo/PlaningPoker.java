package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.agilismo;

import java.util.*;

public class PlaningPoker {
    private final ArrayList<Tareas> tareas;
    private final ArrayList<String> miembros;
    private final Votos votos;
    private final Scanner sc = new Scanner(System.in);

    public PlaningPoker(ArrayList<Tareas> tareas, ArrayList<String> miembros) {
        this.tareas = tareas;
        this.miembros = miembros;
        this.votos = new Votos(miembros);
    }

    public void iniciar() {
        System.out.println("###############SIMULACIÓN DE PLANNING POKER ######################");

        for (Tareas tarea : tareas) {
            System.out.println("Historia: " + tarea.getNombreTarea());
            System.out.println("Descripción: " + tarea.getDescripcion());
            System.out.println("Opciones válidas: " + Fibonacci.numerosSerie);

            Map<String, Integer> votosHistoria = new LinkedHashMap<>();
            boolean consenso = false;

            while (!consenso) {
                votosHistoria.clear();

                for (String miembro : miembros) {
                    int voto;
                    do {
                        System.out.print("Miembro " + miembro + ", ingrese su voto: ");
                        voto = sc.nextInt();
                        if (!Fibonacci.estaEnLaSerie(voto)) {
                            System.out.println(" Opción inválida. Intente nuevamente.");
                        }
                    } while (!Fibonacci.estaEnLaSerie(voto));

                    votosHistoria.put(miembro, voto);
                }

                if (votos.resultados(votosHistoria)) {
                    consenso = true;
                    Integer puntajeFinal = votosHistoria.values().iterator().next();
                    tarea.obtenerPuntajeTotal(puntajeFinal);
                    System.out.println("Consenso alcanzado. Puntaje asignado: " + puntajeFinal);
                } else {
                    System.out.println("Los votos no concuerdan: " + votosHistoria.values());
                    System.out.println(" Discutan y vuelvan a votar.\n");
                }
            }
        }

        mostrarResumen();
    }

    private void mostrarResumen() {
        System.out.println("==========RESUMEN FINAL DE ESTIMACIONES===========");
        for (Tareas tarea : tareas) {
            System.out.println("=====Historia: " + tarea.getNombreTarea() + " | Puntaje: " + tarea.getPuntajeAcum()+"====");
        }
    }
}
