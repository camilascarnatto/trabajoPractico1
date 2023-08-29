package punto_5;

import java.time.LocalDate; //LocalDate.now().plusDays(cant_dias) +
                            //LocalDate.now().minusDays(cant_dias) -

public class Test {
    public static void main(String[] args){

        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        tarea1.setDescripcion("Ir al supermercado mañana");
        tarea1.setFechaLimite(LocalDate.now().plusDays(1));
        tarea1.setPrioridad(Prioridad.ALTA);

        System.out.println("   ");
        System.out.println(" ---- TAREA 1 ----");
        System.out.println("* Descripcion: " + tarea1.mostrarTarea());
        System.out.println("* Está vencida???: " + tarea1.estaVencida());
        System.out.println("* Está completa???: " + tarea1.estaCompleta());
        System.out.println("* Prioridad: " + tarea1.getPrioridad());
        System.out.println("* Fecha limite: " + tarea1.getFechaLimite());

        System.out.println("   ");
        System.out.println(" ---- TAREA 2 ----");

        tarea2.setDescripcion("Consultar repuesto del auto");
        tarea2.setFechaLimite(LocalDate.now().minusDays(1));
        tarea2.setPrioridad(Prioridad.MEDIA);
        tarea2.completar();

        System.out.println("* Descripcion: " + tarea2.mostrarTarea());
        System.out.println("* Está vencida???: "  + tarea2.estaVencida());
        System.out.println("* Está completa???: " + tarea2.estaCompleta());
        System.out.println("* Prioridad: " + tarea2.getPrioridad());
        System.out.println("* Fecha limite: "  + tarea2.getFechaLimite());

        System.out.println("   ");
        System.out.println(" ---- TAREA 3 ----");

        tarea3.setDescripcion("Ir al cine a ver Marvel");
        tarea3.setFechaLimite(LocalDate.now().minusDays(1));
        tarea3.setPrioridad(Prioridad.BAJA);

        System.out.println("* Descripcion: " + tarea3.mostrarTarea());
        System.out.println("* Está vencida???: "  + tarea3.estaVencida());
        System.out.println("* Está completa???: " + tarea3.estaCompleta());
        System.out.println("* Prioridad: " + tarea3.getPrioridad());
        System.out.println("* Fecha limite: "  + tarea3.getFechaLimite());



    }
}
