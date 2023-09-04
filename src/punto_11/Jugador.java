package punto_11;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private int puntaje;
    private String nombre;
    private List<String> palabras = new ArrayList<>();
    private Diccionario diccionario; //Compartido por todos los jugadores

    public Jugador(String nombre, Diccionario diccionario){
        this.nombre = nombre;
        this.diccionario = diccionario;
        puntaje = 0;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPalabra(String palabra){
        if(diccionario.esValida(palabra)){
            palabras.add(palabra);
            calcularPuntaje();
        }
    }

    public void calcularPuntaje(){
        puntaje = 0;
        for (String palabra : palabras){
            puntaje += palabra.length();
            puntaje += calcularLetrasEspeciales(palabra);
        }
    }

    private int calcularLetrasEspeciales(String palabra){
        int contador = 0;
        for(char letra : palabra.toCharArray()){
            if (LetrasEspeciales.esEspecial(letra)){
                contador++;
            }
        }

        return contador;
    }


}
