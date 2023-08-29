package punto_6;

public class Ejemplar {
    /*
        SI USO ESTA CLASE, DE LA CLASE LIBRO SACAR
        CANTEJEMPLARES, CANTEJEMPLARESPRESTADOS Y
        PASARLOS ACA
     */

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
