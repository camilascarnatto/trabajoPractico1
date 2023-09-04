package punto_12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Administrador {
    private List<Tarea> listaDeTareas = new ArrayList<>();

    public void agregarTarea(Tarea tarea){
        listaDeTareas.add(tarea);
    }

    public List<Tarea> obtenerTareasNoVencidasOrdenadas() {
        List<Tarea> tareasNoVencidas = new ArrayList<>();

        for (Tarea tarea : listaDeTareas) {
            if (!tarea.estaVencida() && !tarea.estaCompleta()) {
                tareasNoVencidas.add(tarea);
            }
        }

        Collections.sort(tareasNoVencidas, (t1, t2) -> {
            int prioridadComparison = t1.getPrioridad().compareTo(t2.getPrioridad());
            if (prioridadComparison != 0) {
                return prioridadComparison;
            }
            return t1.getFechaVencimiento().compareTo(t2.getFechaVencimiento());
        });

        return tareasNoVencidas;
    }
    public void marcarTareaCompletada(Tarea tarea){
        tarea.completar();
    }

    public List<Tarea> buscarPorTitulo(String titulo){
        return listaDeTareas.stream()
                .filter(tarea -> tarea.getDescripcion().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Tarea> getListaDeTareas() {
        return listaDeTareas;
    }
}

