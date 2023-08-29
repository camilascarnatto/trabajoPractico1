package punto_6;

public class Libro {

    private String autor;
    private String titulo;
    private int cantPaginas;
    private int cantEjemplares;
    private int cantEjemplaresPrestados = 0;

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(int cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    public int getCantEjemplaresPrestados() {
        return cantEjemplaresPrestados;
    }

    public void setCantEjemplaresPrestados(int cantEjemplaresPrestados) {
        this.cantEjemplaresPrestados = cantEjemplaresPrestados;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public int getEjemplaresDisponibles(){
        return  cantEjemplares - cantEjemplaresPrestados;
    }

    public void devolver() {
        if (cantEjemplaresPrestados > 0) {
            cantEjemplaresPrestados--;
        } else
            throw new IllegalStateException("No hay ejemplares para devolucion");
    }
    public String getDescripcion(){
        int cantDisponibles = cantEjemplares - cantEjemplaresPrestados;

        String descripcion;

        descripcion = "El libro " + titulo + ", creado por " + autor
                        + " tiene " + cantPaginas + " paginas, quedan "
                        + cantDisponibles + " disponibles y se prestaron en total "
                        + cantEjemplaresPrestados + " .";

        return descripcion;
    }

    public void prestar()   {
        if(cantEjemplaresPrestados < cantEjemplares){
            cantEjemplaresPrestados++;

        }else throw new IllegalStateException("No hay ejemplares para prestar. Solo se prestaron " + cantEjemplaresPrestados + " ejemplares");
    }
}
