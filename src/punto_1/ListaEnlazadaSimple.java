package punto_1;
import punto_1.Nodo;
public class ListaEnlazadaSimple {
    private Nodo nodoInicial;
    private int longitud;

    public Nodo getNodoInicial() {
        return nodoInicial;
    }

    public void setNodoInicial(Nodo nodo) {
        this.nodoInicial = nodo;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int size) {
        this.longitud = size;
    }

    public boolean estaVacia() {
        return longitud == 0;
    }


    public void agregarAlFinal(Object valor) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(valor);

        if (nodoInicial == null) {
            nodoInicial = nuevoNodo;
        } else {
            Nodo actual = nodoInicial;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }

        longitud++;
    }

    public void eliminar(int posicion) {
        if (posicion < 0 || posicion >= longitud) {
            throw new IllegalArgumentException("Posición inválida");
        }

        if (posicion == 0) {
            nodoInicial = nodoInicial.getSiguiente();
        } else {
            Nodo anterior = nodoInicial;
            for (int i = 0; i < posicion - 1; i++) {
                anterior = anterior.getSiguiente();
            }
            anterior.setSiguiente(anterior.getSiguiente().getSiguiente());
        }

        longitud--;
    }

    public Object recuperar(int posicion) {
        if (posicion < 0 || posicion >= longitud) {
            throw new IllegalArgumentException("Posición inválida");
        }

        Nodo actual = nodoInicial;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSiguiente();
        }

        return actual.getDato();
    }

    public void insertar(int posicion, Object valor) {
        if (posicion < 0 || posicion > longitud) {
            throw new IllegalArgumentException("Posición inválida");
        }

        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(valor);

        if (posicion == 0) {
            nuevoNodo.setSiguiente(nodoInicial);
            nodoInicial = nuevoNodo;
        } else {
            Nodo anterior = nodoInicial;
            for (int i = 0; i < posicion - 1; i++) {
                anterior = anterior.getSiguiente();
            }
            nuevoNodo.setSiguiente(anterior.getSiguiente());
            anterior.setSiguiente(nuevoNodo);
        }

        longitud++;
    }

    public String mostrarLista() {
        /* mejora de usar StringBuilder en vez de String */
        StringBuilder stringBuilder = new StringBuilder();
        Nodo nodoActual = nodoInicial;
        int posicion = 0;

        while (nodoActual != null) {
            stringBuilder.append("[").append(posicion).append("] : ").append(nodoActual.getDato()).append("\n");
            nodoActual = nodoActual.getSiguiente();
            posicion++;
        }

        return stringBuilder.toString();
    }


}
