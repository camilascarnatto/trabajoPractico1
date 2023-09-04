package punto_13;


public enum Prioridad {
    ALTA,
    MEDIA,
    BAJA;

    private  String nombre;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
