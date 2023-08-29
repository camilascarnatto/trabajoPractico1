package punto_4;

public class Cola {
    private Nodo inicio;
    private Nodo fin;
    private int longitud;

    public void agregar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);

        if(estaVacia()){
            inicio = nuevoNodo;
            fin = nuevoNodo;
        }else{
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        longitud++;
    }

    public boolean estaVacia(){
        return longitud == 0;

    }

    public int getLongitud(){
        return longitud;
    }

    public Object recuperarInicio(){
        if(!estaVacia()){
            return inicio.getDato();
        }else
            throw  new IllegalStateException("La cola esta vacia");
    }

    public Object eliminar(){
        Nodo nodoEliminado = inicio;
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }else{
            inicio = inicio.getSiguiente();
            longitud--;
        }

        return nodoEliminado.getDato();
    }
}
