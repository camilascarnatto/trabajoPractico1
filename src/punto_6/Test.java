package punto_6;

public class Test {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        libro1.setTitulo("El viento conoce mi nombre");
        libro1.setAutor("Isabel Allende");
        libro1.setCantPaginas(450);
        libro1.setCantEjemplares(10);

        libro2.setTitulo("El monje que vendió su ferrari");
        libro2.setAutor(" Sharma Robin");
        libro2.setCantPaginas(310);
        libro2.setCantEjemplares(7);

        biblioteca.agregar(libro1);
        biblioteca.agregar(libro2);

        System.out.println("--- LIBROS DE LA BIBLIOTECA");
        System.out.println("(*)" + libro1.getTitulo() + " - " + libro1.getAutor());
        System.out.println("(*)" + libro2.getTitulo() + " - " + libro2.getAutor());

        System.out.println("  ");

        if (libro1.getCantPaginas() > libro2.getCantPaginas()) {
            System.out.println("El libro '" + libro1.getTitulo().toUpperCase() +"' tiene más páginas.");
        } else if (libro2.getCantPaginas() > libro1.getCantPaginas()) {
            System.out.println("El libro '" + libro2.getTitulo().toUpperCase() +"' tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }


        for(int i = 0; i<10; i++) {
            libro1.prestar();
            //System.out.println("Prestamo (" + i + ") realizado con exito");
        }



        libro2.prestar();

        System.out.println("Libro 1 " + libro1.getDescripcion());
        System.out.println(" ");
        System.out.println("Libro 1 " + libro2.getDescripcion());

        System.out.println(" ");

        int totalPrestamos = biblioteca.getCantPrestamos();
        System.out.println("Cantidad total de prestamos: " + totalPrestamos);



    }
}
