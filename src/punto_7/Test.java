package punto_7;

public class Test {
    public static void main(String[] args){
        Ecuacion ecuacion1 = new Ecuacion();
        Ecuacion ecuacion2 = new Ecuacion();

        ecuacion1.setA(1);
        ecuacion1.setB(-3);
        ecuacion1.setC(2);

        ecuacion2.setA(2);
        ecuacion2.setB(4);
        ecuacion2.setC(2);

        System.out.println("Ecuación 1:");
        System.out.println("Raíces: " + ecuacion1.calcularRaices());
        System.out.println("Valor de y para x=1: " + ecuacion1.calcular(1));

        System.out.println("\nEcuación 2:");
        System.out.println("Raíces: " + ecuacion2.calcularRaices());
        System.out.println("Valor de y para x=3: " + ecuacion2.calcular(3));
    }
}
