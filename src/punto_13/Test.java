package punto_13;

import punto_12.Administrador;

import java.time.LocalDate;
import java.util.List;

public class Test {
    public static void main(String[] args){
        AdministradorTareas administrador = new AdministradorTareas();

        Tarea tarea1 = new Tarea("Ir al supermercado", Prioridad.MEDIA, LocalDate.of(2023,9,10));
        Tarea tarea2 = new Tarea("Enviar mails urgentes", Prioridad.ALTA, LocalDate.of(2023,9,5));
        Tarea tarea3 = new Tarea("Tender ropa", Prioridad.BAJA, LocalDate.of(2023,9,15));


        Colaborador colaborador1 = new Colaborador("Juan");
        Colaborador colaborador2 = new Colaborador("Pepe");

        administrador.agregarTarea(tarea1);
        administrador.agregarTarea(tarea2);
        administrador.agregarTarea(tarea3);


        administrador.marcarTareaRealizada(tarea1, colaborador1, LocalDate.now());
        administrador.marcarTareaRealizada(tarea2, colaborador1, LocalDate.now());
        administrador.marcarTareaRealizada(tarea3, colaborador2, LocalDate.now());

        List<Tarea> tareasRealizadas= administrador.getTareasPorColaborador(colaborador2);
        System.out.println("Tareas realizadas por " + colaborador1.getNombre() + ":");
        for (Tarea tarea : tareasRealizadas) {
            System.out.println("* " + tarea.getDescripcion() + " (Fecha de finalización: " + tarea.getFechaFinalizacion() + ")");
        }
    }
}
