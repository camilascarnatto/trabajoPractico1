package punto_10;

import java.time.LocalDate;

public class Tarea {

    private boolean completa = false; // true: completa, false: incompleta
    private Prioridad prioridad;
    private String descripcion;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;


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



    public void setFechaLimite(LocalDate fecha) {
        this.fechaLimite = fecha;
    }

    public LocalDate getFechaLimite(){
        return fechaLimite;
    }

    public Prioridad getPrioridad(){
        return prioridad;
    }

    public String mostrarTarea(){

        LocalDate fechaActual = LocalDate.now();
        if(!completa){
            if(fechaRecordatorio != null){
                if(fechaActual.isBefore(fechaLimite)){
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
        return !completa && fechaActual.isAfter(fechaLimite);


    }


}
