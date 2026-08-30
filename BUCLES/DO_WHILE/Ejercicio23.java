/* 68.Un número se dice que es perfecto si la suma de sus divisores excepto él mismo es igual a dicho
número. Ejemplo: 6 es un número perfecto ya que sus divisores: 1 + 2 + 3 suman seis. Diseñe un
algoritmo o programa que imprima los tres primeros números perfectos. */

package BUCLES.DO_WHILE;

public class Ejercicio23 {

    public static void main(String[] args) {

        int numero = 1;
        int encontrados = 0;

        do {

            int divisor = 1;
            int sumaDivisores = 0;

            do {

                if (numero % divisor == 0) {
                    sumaDivisores += divisor;
                }

                divisor++;

            } while (divisor < numero);

            if (sumaDivisores == numero) {
                System.out.println("Número perfecto: " + numero);
                encontrados++;
            }

            numero++;

        } while (encontrados < 3);
    }
}
