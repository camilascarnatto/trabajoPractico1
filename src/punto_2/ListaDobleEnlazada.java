package punto_2;
import punto_2.Nodo;
public class ListaDobleEnlazada {

    private Nodo nodoInicial;
    private Nodo ultimoNodo;
    private int longitud;

    public boolean estaVacia(){
        return longitud == 0;
    }

    public int getLongitud() {
        return longitud;
    }

    public void agregar(Object dato){
        Nodo nuevoNodo =  new Nodo();
        nuevoNodo.setDato(dato);

        if(nodoInicial != null){
            nuevoNodo.setAnterior(this.ultimoNodo);
            ultimoNodo.setSiguiente(nuevoNodo);
            ultimoNodo = nuevoNodo;
        }else{
            nodoInicial = nuevoNodo;
            ultimoNodo = nodoInicial;
        }

        longitud++;
    }

    /*
        Encuentra y devuelve el nodo
        en la posicion que se le pasa como parametro.
        Busca el nodo dependiendo si la posicion esta mas cerca
        del inicio o el final de la lista, segun la long.
     */
    private Nodo getNodoPosicion(int posicion){
        Nodo nodoActual = new Nodo();

        if (posicion < longitud / 2){
            nodoActual = nodoInicial;

            for (int i = 0; i < posicion; i++){
                nodoActual = nodoActual.getSiguiente();
            }
        }else{
            nodoActual = ultimoNodo;
            for (int i = longitud - 1; i > posicion; i--){
                nodoActual = nodoActual.getAnterior();
            }
        }

        return  nodoActual;
    }
    public void insertar(Object dato, int pos){
        if(!(pos >= 0 && pos < longitud)){
            throw  new IllegalArgumentException("La posicion es invalida!!");
        }

        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);

        if (pos == 0) {
            nuevoNodo.setSiguiente(nodoInicial);
            if (nodoInicial != null) {
                nodoInicial.setAnterior(nuevoNodo);
            }
            nodoInicial = nuevoNodo;
        } else {
            if (pos == longitud) {
                nuevoNodo.setAnterior(ultimoNodo);
                ultimoNodo.setSiguiente(nuevoNodo);
                ultimoNodo = nuevoNodo;
            } else {
                Nodo nodoActual = new Nodo();
                Nodo nodoAnterior = new Nodo();
                nodoActual = getNodoPosicion(pos);
                nodoAnterior = nodoActual.getAnterior();

                nuevoNodo.setAnterior(nodoAnterior);
                nuevoNodo.setSiguiente(nodoActual);

                nodoAnterior.setSiguiente(nuevoNodo);
                nodoActual.setAnterior(nuevoNodo);
            }

        }

        longitud++;
    }

    public void eliminar(int pos){
        if(!(pos >= 0 && pos < longitud)){
            throw  new IllegalArgumentException("La posicion es invalida!!");
        }

        Nodo nodoActual = new Nodo();
        Nodo nodoAnterior = new Nodo();
        Nodo nodoSiguiente = new Nodo();

        nodoActual = nodoInicial;

        for(int i = 0; i < pos; i++){
            nodoActual = nodoActual.getSiguiente();
        }

        nodoAnterior = nodoActual.getAnterior();
        nodoSiguiente = nodoActual.getSiguiente();

        if(nodoAnterior != null){
            nodoAnterior.setSiguiente(nodoSiguiente);
        }else nodoInicial = nodoSiguiente;

        if(nodoSiguiente != null){
            nodoSiguiente.setAnterior(nodoAnterior);
        }else ultimoNodo = nodoAnterior;


        longitud--;
    }

    public String mostrarLista() {
        StringBuilder stringBuilder = new StringBuilder();
        Nodo nodoActual = new Nodo();
        int posicion = 0;

        nodoActual = nodoInicial;

        while (nodoActual != null) {
            stringBuilder.append("[").append(posicion).append("] : ").append(nodoActual.getDato()).append("\n");
            nodoActual = nodoActual.getSiguiente();
            posicion++;
        }
        return stringBuilder.toString();
    }

    public Object recuperar(int pos){
        if(!(pos >= 0 && pos < longitud)){
            throw  new IllegalArgumentException("La posicion es invalida!!");
        }

        Nodo nodoActual = new  Nodo();
        nodoActual = nodoInicial;

        for (int i = 0; i < pos; i++){
            nodoActual = nodoActual.getSiguiente();
        }

        return nodoActual;
    }

}
