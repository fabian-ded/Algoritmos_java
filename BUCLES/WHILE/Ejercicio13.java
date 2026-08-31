package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double capital;
        double taza_interes;
        double interes;
        int semanas;
        int contador = 0;

        System.out.println("Ingrese el capital: ");
        capital = entrada.nextDouble();

        System.out.println("Ingrese el interes: ");
        interes = entrada.nextDouble();

        System.out.println("Ingrese las semanas: ");
        semanas = entrada.nextInt();

        int dias = semanas * 7;
        double convertir = interes / 100;

        while (contador < dias) {

            contador++;

            taza_interes = (convertir * capital) / 365;

            capital += taza_interes;
        }

        System.out.println("El capital tuvo una ganancia de: " + capital);
    }
}
