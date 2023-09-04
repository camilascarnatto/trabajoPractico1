package punto_12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] arg) {
        Administrador administrador = new Administrador();

        Tarea tarea1 = new Tarea("Ir al supermercado", Prioridad.ALTA, LocalDate.of(2023, 9, 10));
        Tarea tarea2 = new Tarea("Leer apuntes", Prioridad.MEDIA, LocalDate.of(2023, 9, 5));
        Tarea tarea3 = new Tarea("Pasear al perro", Prioridad.BAJA, LocalDate.of(2023, 9, 15));
        Tarea tarea4 = new Tarea("Pagar facturas", Prioridad.ALTA, LocalDate.of(2023, 9, 1));
        Tarea tarea5 = new Tarea("Enviar mails", Prioridad.MEDIA, LocalDate.of(2023, 9, 8));

        administrador.agregarTarea(tarea1);
        administrador.agregarTarea(tarea2);
        administrador.agregarTarea(tarea3);
        administrador.agregarTarea(tarea4);
        administrador.agregarTarea(tarea5);

        //Marcar como completadas
        administrador.marcarTareaCompletada(tarea2);
        administrador.marcarTareaCompletada(tarea4);

        List<Tarea> tareasNoVencidas = administrador.obtenerTareasNoVencidasOrdenadas();

        // Separar tareas primero por prioridad y luego por fecha
        List<Tarea> tareasOrdenadasPorPrioridad = new ArrayList<>();
        List<Tarea> tareasOrdenadasPorFecha = new ArrayList<>();

        for (Tarea tarea : tareasNoVencidas) {
            if (!tarea.estaVencida()) {
                tareasOrdenadasPorPrioridad.add(tarea);
                tareasOrdenadasPorFecha.add(tarea);
            }
        }

        // Ordenar las listas por prioridad y fecha
        tareasOrdenadasPorPrioridad.sort((t1, t2) -> t1.getPrioridad().compareTo(t2.getPrioridad()));
        tareasOrdenadasPorFecha.sort((t1, t2) -> t1.getFechaVencimiento().compareTo(t2.getFechaVencimiento()));

        // Imprimir tareas ordenadas por prioridad
        System.out.println("Tareas no vencidas ordenadas por prioridad:");
        for (Tarea tarea : tareasOrdenadasPorPrioridad) {
            System.out.println("Prioridad [" + tarea.getPrioridad() + "] " + tarea.mostrarTarea());
        }

        // Imprimir tareas ordenadas por fecha
        System.out.println("\nTareas no vencidas ordenadas por fecha de vencimiento:");
        for (Tarea tarea : tareasOrdenadasPorFecha) {
            System.out.println("Fecha ["+ tarea.getFechaVencimiento() + "] " + tarea.mostrarTarea());
        }

    }
}
