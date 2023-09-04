package punto_12;


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
