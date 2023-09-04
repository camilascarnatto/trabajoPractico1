package punto_11;

import java.util.HashSet;
import java.util.Set;

public class Diccionario {
    private Set<String> palabras = new HashSet<>();

    public void agregar(String palabraa){
        palabras.add(palabraa.toLowerCase());
    }

    public boolean esValida(String palabra){
        return  palabras.contains(palabra.toLowerCase());
    }

}
