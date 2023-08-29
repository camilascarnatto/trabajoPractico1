package punto_7;

import java.util.ArrayList;
import java.util.List;

public class Ecuacion {
    private double a;
    private double b;
    private double c;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }


    public void setC(double c) {
        this.c = c;
    }

    public double calcular(double x){
        return  a * x * x + b * x + c ;
    }

    public List<Double> calcularRaices(){
        List<Double> raices = new ArrayList<>();

        double discriminante  = b * b - 4 * a * c;

        if(discriminante >= 0){
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            raices.add(raiz1);
            raices.add(raiz2);
        }
        return raices;
    }
}
