package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        int numero = 1;
        int encontrados = 0;

        while (encontrados < 3) {

            int divisor = 1;
            int sumaDivisores = 0;

            while (divisor < numero) {

                if (numero % divisor == 0) {
                    sumaDivisores += divisor;
                }

                divisor++;
            }

            if (sumaDivisores == numero) {
                System.out.println("Número perfecto: " + numero);
                encontrados++;
            }

            numero++;
        }
    }
}
