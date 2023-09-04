package punto_11;

public class Test {

    public static void main(String[] args) {
        // Crear un diccionario compartido
        Diccionario diccionario = crearDiccionario();

        // Crear jugadores
        Jugador jugador1 = new Jugador("Jugador 1", diccionario);
        Jugador jugador2 = new Jugador("Jugador 2", diccionario);

        establecerPalabrasJugadores(diccionario, jugador1, jugador2);

        mostrarGanador(jugador1,jugador2);
    }

    private static Diccionario crearDiccionario(){
        Diccionario diccionario = new Diccionario();
        diccionario.agregar("programacion");
        diccionario.agregar("orientada");
        diccionario.agregar("objetos");
        diccionario.agregar("materia");
        diccionario.agregar("sistemas");
        diccionario.agregar("phyton");
        diccionario.agregar("sintaxis");
        diccionario.agregar("array");
        diccionario.agregar("backup");
        diccionario.agregar("link");
        diccionario.agregar("hexadecimal");
        diccionario.agregar("query");
        diccionario.agregar("sql");
        diccionario.agregar("web");
        diccionario.agregar("workflow");
        return diccionario;
    }

    private static void establecerPalabrasJugadores(Diccionario diccionario, Jugador jugador1, Jugador jugador2){
        //JUGADOR 1
        jugador1.agregarPalabra("phyton");
        jugador1.agregarPalabra("workflow");
        jugador1.agregarPalabra("array");
        jugador1.agregarPalabra("backup");

        //JUGADOR 2
        jugador2.agregarPalabra("phyton");
        jugador2.agregarPalabra("workflow");
        jugador2.agregarPalabra("array");
        jugador2.agregarPalabra("backup");
        jugador2.agregarPalabra("query");
        jugador2.agregarPalabra("unlu");
        jugador2.agregarPalabra("zorro");


    }

    private static void mostrarGanador(Jugador jugador1, Jugador jugador2){
        int puntajeJugador1 = jugador1.getPuntaje();
        int puntajeJugador2 = jugador2.getPuntaje();

        if(puntajeJugador1 > puntajeJugador2){
            System.out.println("El ganador es '" + jugador1.getNombre() + "' con " + jugador1.getPuntaje() + " puntos");
            System.out.println(" ");
            System.out.println(jugador2.getNombre() + " perdió con " + jugador2.getPuntaje() + " puntos");
        }else {
            if (puntajeJugador2 > puntajeJugador1) {
                System.out.println("El ganador es '" + jugador2.getNombre() + "' con " + jugador2.getPuntaje() + " puntos");
                System.out.println(" ");
                System.out.println(jugador1.getNombre() + " perdió con " + jugador1.getPuntaje() + " puntos");
            } else {
                System.out.println("Hay un empate entre los jugadores.");
                System.out.println(" ");
                System.out.println(jugador1.getNombre() + " - " + jugador1.getPuntaje() + " puntos");
                System.out.println(jugador2.getNombre() + " - " + jugador2.getPuntaje() + " puntos");
            }

        }
    }
}
