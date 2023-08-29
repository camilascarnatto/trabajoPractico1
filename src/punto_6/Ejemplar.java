package punto_6;

public class Ejemplar {
    private boolean disponible = true;

    public boolean estaDisponible(){
        return disponible;
    }

    public void prestar(){
        if(disponible) disponible = false;
    }

    public void devolver(){
        if(!disponible) disponible = true;
    }
}
