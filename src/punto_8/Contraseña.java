package punto_8;

import java.util.Random;

public class Contraseña {
    private int longitud;
    private String password;
    private String caracteres;

    public Contraseña(int longitud){
        this.longitud = longitud;
        this.caracteres = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        generarContraseña();
    }

    public Contraseña(int longitud, String caracteres){
        this.longitud = longitud;
        this.caracteres = caracteres;
        generarContraseña();
    }

    public Contraseña(){
        this(8);
    }

    private void generarContraseña(){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < longitud; i++){
            int index = random.nextInt(caracteres.length());
            stringBuilder.append(caracteres.charAt(index));
        }

        password = stringBuilder.toString();

    }

    public String getPassword(){
        return password;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean esFuerte(){
        int cantNumeros = 0;
        int cantMayusculas = 0;
        int cantMinusculas = 0;

        for (char c : password.toCharArray()){
            if(Character.isDigit(c)){
                cantNumeros++;
            }else
                if(Character.isUpperCase(c)){
                    cantMayusculas++;
                }else
                    if(Character.isLowerCase(c)){
                        cantMinusculas++;
                    }
        }
        if (cantNumeros > 1 && cantMayusculas > 2 && cantMinusculas > 1) {
            return true;
        } else {
            return false;
        }
    }

    public void regenerar(){
        generarContraseña();
        while (!esFuerte()){
            generarContraseña();
        }
    }
}
