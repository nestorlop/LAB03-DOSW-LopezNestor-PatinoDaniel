package edu.dosw.lab.LAB03_DOSW_LopezNestor_PatinoDaniel.Simulacion;

public class Tareas {
    private final String nombreTarea;
    private final String descripcion;
    private Integer puntajes;
  
    public Tareas( String nombreTarea,String descripcion){
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        
    }
    public String getNombreTarea(){ return nombreTarea; }
    public String getDescripcion(){ return descripcion; }
    public Integer getPuntajeAcum(){ return puntajes; }
    public void obtenerPuntajeTotal(Integer puntajeAcum){ this.puntajes = puntajeAcum; }
}
