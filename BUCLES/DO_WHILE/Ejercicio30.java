/* 75. Cinco miembros de un club contra la obesidad desean saber cuánto han bajado o subido de peso
desde la última vez que se reunieron. Para esto se debe realizar un ritual de pesaje en donde cada
uno se pesa en diez básculas distintas para así tener el promedio más exacto de su peso. Si existe
diferencia positiva entre este promedio de peso y el peso de la última vez que se reunieron, significa
que subieron de peso. Pero si la diferencia es negativa, significa que bajaron. Lo que el problema
requiere es que por cada persona se imprima un mensaje que diga SUBIO ó BAJO y la cantidad de
kilos que subió o bajó de peso. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int persona = 1;

        do {

            System.out.println("\n========== PERSONA #" + persona + " ==========");

            System.out.println("Ingrese el peso de la última reunión:");
            double pesoAnterior = entrada.nextDouble();

            int bascula = 1;
            double sumaPesos = 0;

            do {

                System.out.println(
                        "Ingrese el peso de la báscula #" + bascula + ":"
                );

                double pesoActual = entrada.nextDouble();

                sumaPesos += pesoActual;

                bascula++;

            } while (bascula <= 10);

            // Calcular el promedio de las 10 básculas
            double promedioPeso = sumaPesos / 10;

            // Calcular la diferencia
            double diferencia = promedioPeso - pesoAnterior;

            System.out.println("\nPromedio de peso: " + promedioPeso);

            if (diferencia > 0) {

                System.out.println(
                        "SUBIÓ " + diferencia + " kg"
                );

            } else if (diferencia < 0) {

                System.out.println(
                        "BAJÓ " + Math.abs(diferencia) + " kg"
                );

            } else {

                System.out.println(
                        "MANTUVO EL MISMO PESO"
                );
            }

            persona++;

        } while (persona <= 5);
    }
}
