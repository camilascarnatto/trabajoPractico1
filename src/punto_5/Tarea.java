package punto_5;

import java.time.LocalDate;

public class Tarea {

    private boolean completa = false; // true: completa, false: incompleta
    private Prioridad prioridad;
    private String descripcion;
    private LocalDate fechaLimite;

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
        if(completa){
            return "[TAREA VENCIDA] -> " + descripcion;
        }else return descripcion;
    }

    public void setPrioridad(Prioridad prioridad){
        this.prioridad = prioridad;
    }

    public boolean estaVencida(){

        LocalDate fechaActual = LocalDate.now();
        return !completa && fechaActual.isAfter(fechaLimite);


    }


}

