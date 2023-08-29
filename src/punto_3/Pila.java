package punto_3;

public class Pila {
    private Nodo tope = null;

    public boolean estaVacia(){

        return tope == null;
    }

    public void apilar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if(estaVacia()){
            tope = nuevoNodo;
        }else{
            nuevoNodo.setSiguiente(tope);
            tope = nuevoNodo;
        }
    }

    public Object desapilar(){
        if(estaVacia()){
            throw new IllegalStateException("La pila esta vacia");
        }else{
            Nodo  nodoDesapilado = new Nodo();
            nodoDesapilado.setDato(tope.getDato());
            tope = tope.getSiguiente();
            return nodoDesapilado.getDato();

        }
    }

    public Object recuperar(){
        if(estaVacia()){
            throw new IllegalStateException("La pila esta vacia");
        }else{
            return tope.getDato();
        }
    }

    public int getLongitud(){
        int longitud = 0;
        Nodo actual = tope;
        while(actual != null){
            longitud++;
            actual = actual.getSiguiente();
        }
        return longitud;
    }

}
