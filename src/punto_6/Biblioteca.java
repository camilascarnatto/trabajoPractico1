package punto_6;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void agregar(Libro libro){
        libros.add(libro);
    }

    public int getCantPrestamos(){
        int total = 0;

        for (Libro libro : libros){
            total += libro.getCantEjemplaresPrestados();
        }

        return total;
    }

    public Libro buscarPorTitulo(String titulo){
        for(Libro libro : libros){
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                return libro;
            }
        }
        return null;
    }

    public Libro buscarPorAutor(String autor){
        for(Libro libro : libros){
            if(libro.getAutor().equalsIgnoreCase(autor)){
                return libro;
            }
        }
        return null;
    }

}
