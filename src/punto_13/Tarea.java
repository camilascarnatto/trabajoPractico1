package punto_13;


import punto_4.Cola;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tarea {

    private boolean completa; // true: completa, false: incompleta
    private Prioridad prioridad;
    private String descripcion;
    private LocalDate fechaVencimiento;
    private LocalDate fechaRecordatorio;
    private List<Colaborador> colaboradores;
    private LocalDate fechaFinalizacion;

    public Tarea(String descripcion, Prioridad prioridad, LocalDate fechaVenc){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completa = false;
        this.fechaVencimiento = fechaVenc;
        this.colaboradores = new ArrayList<>();
        this.fechaFinalizacion = null;
    }
    public void setFechaRecordatorio(LocalDate fecha){
        this.fechaRecordatorio = fecha;
    }

    public LocalDate getFechaRecordatorio() {
        return fechaRecordatorio;
    }

    public void completar(){
        this.completa = true;
    }

    public boolean estaCompleta() {
        return completa;
    }

    public String getDescripcion(){
        return  descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }



    public void setFechaVencimiento(LocalDate fecha) {
        this.fechaVencimiento = fecha;
    }

    public LocalDate getFechaVencimiento(){
        return fechaVencimiento;
    }

    public Prioridad getPrioridad(){
        return prioridad;
    }

    public String getPrioridadString(){
        return prioridad.getNombre();
    }

    public String mostrarTarea(){

        LocalDate fechaActual = LocalDate.now();
        if(!completa){
            if(fechaRecordatorio != null){
                if(fechaActual.isBefore(fechaVencimiento)){
                    prioridad = Prioridad.ALTA;
                }
                if(fechaActual.isBefore(fechaRecordatorio)){
                    return "(POR VENCER) " + descripcion;
                }
            }
        }


        return  descripcion;

    }

    public void setPrioridad(Prioridad prioridad){
        this.prioridad = prioridad;
    }

    public boolean estaVencida(){

        LocalDate fechaActual = LocalDate.now();
        return !completa && fechaActual.isAfter(fechaVencimiento);


    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void agregarColaborador(Colaborador colaborador) {
        colaboradores.add(colaborador);
    }

    public void marcarComoRealizada(LocalDate fecha, Colaborador colaborador){
        this.completa = true;
        this.fechaFinalizacion = fecha;
        this.colaboradores.add(colaborador);
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
}
