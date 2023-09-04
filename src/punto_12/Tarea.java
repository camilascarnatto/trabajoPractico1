package punto_12;


import java.time.LocalDate;

public class Tarea {

    private boolean completa; // true: completa, false: incompleta
    private Prioridad prioridad;
    private String descripcion;
    private LocalDate fechaVencimiento;
    private LocalDate fechaRecordatorio;

    public Tarea(String descripcion, Prioridad prioridad, LocalDate fechaVenc){
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completa = false;
        this.fechaVencimiento = fechaVenc;
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


}
