package punto_10;

import java.time.LocalDate;

public class Test {
    public static void main( String[] args){
        Tarea tarea = new Tarea();

        tarea.setDescripcion("Hacer analisis de sangre");
        tarea.setFechaLimite(LocalDate.of(2023,9,30));
        tarea.setFechaRecordatorio(LocalDate.of(2023,9,25));
        tarea.setPrioridad(Prioridad.BAJA);
        

        System.out.println(tarea.mostrarTarea());

    }

}
