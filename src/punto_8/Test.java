package punto_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    /*  Metodo que valida que lo ingresado sea siempre un numero
        para longitud y cant de contraseñas a generar
    */

    public static int obtenerNumero(Scanner scanner, String msjEnPantalla){
        int valorIngresado;
        while (true){
            System.out.println(msjEnPantalla);
            if (scanner.hasNextInt()){
                valorIngresado = scanner.nextInt();
                if (valorIngresado > 0){
                    break;
                }else{
                    System.out.println("ATENCION! Ingresar un numero positivo.");
                }
            }else{
                System.out.println("ATENCION! Debe ingresar solo numeros.");
                scanner.next();
            }


        }
        return valorIngresado;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // System.out.println("Ingrese cantidad de contraseñas a generar ");
        //System.out.println("Ingrese la longitud deseada para las contraseñas");
        //int longitudIngresada = scanner.nextInt();

        int cantidadContraseñas = obtenerNumero(scanner, "Ingrese cantidad de contraseñas a generar: ");
        int longitudIngresada = obtenerNumero(scanner, "Ingrese la longitud deseada para las contraseñas: ");

        List<Contraseña> contraseñas = new ArrayList<>();

        for (int i = 0; i < cantidadContraseñas; i++){
            contraseñas.add(new Contraseña(longitudIngresada));
        }

        System.out.println("Contraseñas generadas:");

        for (int i = 0; i < contraseñas.size(); i++) {
            Contraseña pass = contraseñas.get(i);
            String fuerte = pass.esFuerte() ? "FUERTE" : "DEBIL";
            System.out.println("[" + i + "] " + pass.getPassword() + " - " + fuerte);
        }

        System.out.println(" ");
        System.out.println("Desea cambiar la longitud de una contraseña? (Y/N) : ");
        String rtaCambiarLong = scanner.next().toLowerCase();

        if(rtaCambiarLong.equals("y")){
            int intentos = 0;
            int indiceContraseña = -1;

            while (intentos < 3){
                System.out.println("Ingrese el indice de la contraseña a cambiar (0 - " + (contraseñas.size() -1) + "): ");
                indiceContraseña = scanner.nextInt();

                if(indiceContraseña >= 0 && indiceContraseña < contraseñas.size()){
                    break;
                }else{
                    intentos++;
                }
                if(intentos < 3){
                    System.out.println("Ingresó un indice invalido. Vuelva a intentar! ");
                }



            }

            if (intentos == 3){
                System.out.println("Indice invalido. ");
                return;
            }


            String password = contraseñas.get(indiceContraseña).getPassword();
            int nuevaLong = obtenerNumero(scanner, "Ingrese la nueva longitud para la contraseña ["+  password +"] :");
            contraseñas.get(indiceContraseña).setLongitud(nuevaLong);
            contraseñas.get(indiceContraseña).regenerar();
            System.out.println("Longitud cambiada con exito.");
            System.out.println(" ");

            String fuerte = contraseñas.get(indiceContraseña).esFuerte() ?"FUERTE" : "DEBIL";
            System.out.println("La nueva nueva contraseña: "+ contraseñas.get(indiceContraseña).getPassword() + " es " + fuerte);

        }else{
            if(rtaCambiarLong.equals("n")){
                System.out.println("No se realizaron cambios.");
            }else System.out.println("Respuesta invalida.");
        }

    }
}
