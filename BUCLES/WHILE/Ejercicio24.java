package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        int numero = 2;
        int encontrados = 0;

        while (encontrados < 5) {

            int divisor = 1;
            int sumaA = 0;

            // Buscar divisores de A
            while (divisor < numero) {

                if (numero % divisor == 0) {
                    sumaA += divisor;
                }

                divisor++;
            }

            int B = sumaA;

            // Evitar comprobar el mismo número consigo mismo
            if (B > numero) {

                int divisorB = 1;
                int sumaB = 0;

                // Buscar divisores de B
                while (divisorB < B) {

                    if (B % divisorB == 0) {
                        sumaB += divisorB;
                    }

                    divisorB++;
                }

                // Comprobar si son amigos
                if (sumaB == numero) {

                    System.out.println(
                            "Par de números amigos: "
                                    + numero + " y " + B
                    );

                    encontrados++;
                }
            }

            numero++;
        }
    }
}
