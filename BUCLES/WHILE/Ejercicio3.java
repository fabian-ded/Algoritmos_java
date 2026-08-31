package BUCLES.WHILE;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        double F,C,R,K;
        int fin = 0;
        Scanner Entrada = new Scanner(System.in);
        System. out. println("Ingnese La tempenatura en Fahrenheit: ");
        F = Entrada.nextDouble();
        C = 5*(F-32) /9;
        R = F+459.67;
        K = C + 273.15;

        while (fin == 0){
            fin++;
            System.out.println("La temperatura en Celsius: " + C);
            System.out.println("La temperatuna en Rankine: " + R);
            System.out.println("La temperatura en Kelvin: " + K);
        }

    }
}
