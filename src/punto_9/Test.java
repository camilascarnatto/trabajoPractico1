package punto_9;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args){

        LocalDate fecha1 = Fecha.obtenerFechaDesdeString("05-29-1998", "MM-dd-yyyy");
        LocalDate fecha2 = Fecha.obtenerFechaDesdeString("01-12-2001", "dd-MM-yyyy");
        LocalDate fecha3 = Fecha.obtenerFechaDesdeString("12-09-2023", "MM-dd-yyyy");

        /*
            LocalDate fecha1 = Fecha.obtenerFechaDesdeString("29-05-1998", "dd-MM-yyyy");
            LocalDate fecha2 = Fecha.obtenerFechaDesdeString("12-01-2001", "dd-MM-yyyy");
            LocalDate fecha3 = Fecha.obtenerFechaDesdeString("09-12-2023", "dd-MM-yyyy");

         */

        if(fecha1 != null && fecha2 != null && fecha3!= null){
            System.out.println("Fecha 1:  " + fecha1);
            System.out.println("Fecha 2:  " + fecha2);
            System.out.println("Fecha 3:  " + fecha3);

            boolean enRango = Fecha.enRango(fecha2, fecha1, fecha3);
            System.out.println("La fecha " + fecha2 + ", ¿está entre "+ fecha1 + " y " + fecha3 + " ?");
            System.out.println("Respuesta: " + enRango);


            boolean esMayor = Fecha.fechaMayor(fecha1, fecha3);
            System.out.println("La fecha " + fecha3 + ", ¿es MAYOR que la fecha "+ fecha1 + " ?");
            System.out.println("Respuesta: " + esMayor);

            boolean esMenor = Fecha.fechaMenor(fecha1,fecha2);
            System.out.println("La fecha " + fecha1 + ", ¿es MENOR que la fecha  "+ fecha2 +  " ?");
            System.out.println("Respuesta: " + esMenor);


        }
    }

}
