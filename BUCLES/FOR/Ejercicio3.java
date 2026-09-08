package BUCLES.FOR;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        double F,C,R,K;
        Scanner Entrada = new Scanner(System.in);
        System. out. println("Ingrese La tempenatura en Fahrenheit: ");
        F = Entrada.nextDouble();
        C = 5*(F-32) /9;
        R = F+459.67;
        K = C + 273.15;

        for (int fin = 1; fin > 0; fin--){
            System.out.println("La temperatura en Celsius: " + C);
            System.out.println("La temperatuna en Rankine: " + R);
            System.out.println("La temperatura en Kelvin: " + K);
        }

    }
}
