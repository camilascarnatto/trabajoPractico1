package punto_2;

public class Test {

    public static void main(String[] args) {

        System.out.println(" " );
        System.out.println("-----CREACION LISTA----- " );
        ListaDobleEnlazada lista = new ListaDobleEnlazada();

        System.out.println("Lista vacia?: " + lista.estaVacia());
        System.out.println(" ------------------ ");

        System.out.println("Agrega elementos.. " );
        System.out.println(" ------------------ ");


        lista.agregar("1");
        lista.agregar("2");
        lista.agregar("3");
        lista.agregar("4");

        System.out.println("Lista vacia?: " + lista.estaVacia());
        System.out.println(" ------------------ ");


        System.out.println("Mostrar Lista :");
        System.out.println(lista.mostrarLista());
        System.out.println(" ------------------ ");

        lista.eliminar(2);
        System.out.println("\nLista después de eliminar el elemento en posición 2:");
        System.out.println(lista.mostrarLista());
        System.out.println(" ------------------ ");

        lista.insertar("Elemento Insertado",1);
        System.out.println("\nLista después de insertar un elemento en posición 1:");
        System.out.println(lista.mostrarLista());
    }
}
