package punto_1;

public class Test {
    public static void main(String[] args) {
        System.out.println(" " );
        System.out.println("-----CREACION LISTA----- " );
        ListaEnlazadaSimple list = new ListaEnlazadaSimple();

        System.out.println("Lista vacia?: " + list.estaVacia());
        System.out.println(" ------------------ ");

        System.out.println("Inserta elementos.. " );
        System.out.println(" ------------------ ");

        list.agregarAlFinal(2);
        list.agregarAlFinal(6);
        list.agregarAlFinal(10);
        list.agregarAlFinal(18);
        list.agregarAlFinal(24);
        list.agregarAlFinal(30);

        System.out.println("Lista vacia?: " + list.estaVacia());
        System.out.println(" ------------------ ");

        System.out.println("Mostrar Lista: ");
        System.out.println(list.mostrarLista());
        System.out.println(" ------------------ ");


        System.out.println("Longitud de la lista: " + list.getLongitud());
        System.out.println(" ------------------ ");

        System.out.println("Elemento de la posición [3]: " + list.recuperar(3));
        System.out.println(" ------------------ ");

        System.out.println("Elimina elemento de la posicion [3] ");
        list.eliminar(3);
        System.out.println(" ------------------ ");

        System.out.println("Mostrar lista despues de eliminar: ");
        System.out.println(list.mostrarLista());
        System.out.println(" ------------------ ");

        System.out.println("Longitud de la lista después de eliminar: " + list.getLongitud());
        System.out.println(" ------------------ ");

        System.out.println("Inserta elemento en la posicion [3] ");
        list.insertar(3, 500);
        System.out.println(" ------------------ ");

        System.out.println("Mostrar Lista depsues de insertar: ");
        System.out.println(list.mostrarLista());
        System.out.println(" ------------------ ");


        System.out.println("Elemento en la posición 3 después de insertar: " + list.recuperar(3));
        System.out.println(" --------Fin TEST---------- ");

    }
}
