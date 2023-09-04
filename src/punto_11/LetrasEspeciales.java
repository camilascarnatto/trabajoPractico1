package punto_11;

public enum LetrasEspeciales {
    K('k'),
    Z('z'),
    X('x'),
    Y('y'),
    W('w'),
    Q('q');

    private final char letra;

    LetrasEspeciales(char letra) {
        this.letra = letra;
    }

    public static boolean esEspecial(char letra) {
        for (LetrasEspeciales especial : values()) {
            if (especial.letra == letra) {
                return true;
            }
        }
        return false;
    }

}
