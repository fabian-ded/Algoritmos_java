package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int persona = 1;

        while (persona <= 5) {

            System.out.println("\n========== PERSONA #" + persona + " ==========");

            System.out.println("Ingrese el peso de la última reunión:");
            double pesoAnterior = entrada.nextDouble();

            int bascula = 1;
            double sumaPesos = 0;

            while (bascula <= 10) {

                System.out.println(
                        "Ingrese el peso de la báscula #" + bascula + ":"
                );

                double pesoActual = entrada.nextDouble();

                sumaPesos += pesoActual;

                bascula++;
            }

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
        }
    }
}
