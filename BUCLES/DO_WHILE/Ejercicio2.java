/* Escriba un programa que imprima todos los enteros positivos impares menores que 100
omitiéndose aquellos que sean divisibles por 7. */

package BUCLES.DO_WHILE;

public class Ejercicio2 {
    public static void main(String[] args) {

        int numero = 1;

        do {
            System.out.println(numero);
            numero += 2;
            if (numero % 7 == 0) {
                numero += 2;
            }
        } while (numero < 100);

    }
}
