package punto_9;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
    private static DateTimeFormatter dateFormat_d_M_y = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static DateTimeFormatter dateFormat_M_d_y = DateTimeFormatter.ofPattern("MM-dd-yyyy");

    public static LocalDate obtenerFechaDesdeString (String fecha, String format ){
        DateTimeFormatter date = format.equals("MM-dd-yyyy") ? dateFormat_M_d_y : dateFormat_d_M_y;
        return LocalDate.parse(fecha, date);
    }

    public static boolean enRango(LocalDate fecha, LocalDate fechaIni, LocalDate fechaFin){
        return fecha.isAfter(fechaIni) && fecha.isBefore(fechaFin);
    }

    public static boolean fechaMayor(LocalDate fecha1, LocalDate fecha2){
        return fecha1.isAfter(fecha2);
    }

    public static boolean fechaMenor(LocalDate fecha1, LocalDate fecha2){
        return fecha1.isBefore(fecha2);
    }

}
