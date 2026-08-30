/* Dada la siguiente serie: 1 + 1⁄2 + 1⁄4 + 1/8 + 1/16 + 1/32 + ... Desarrolle un algoritmo o programa que
determine el número de términos necesarios para obtener la suma que más se aproxime al valor de
1.99. Se debe imprimir el número de términos y el valor de la suma cuando cumpla la condición
mencionada antes. */

package BUCLES.DO_WHILE;

public class Ejercicio19 {

    public static void main(String[] args) {

        double suma = 0;
        double termino = 1;
        int cantidadTerminos = 0;

        do {

            if (suma + termino <= 1.99) {
                suma += termino;
                cantidadTerminos++;
            }

            termino /= 2;

        } while (suma + termino <= 1.99);

        System.out.println("Número de términos: " + cantidadTerminos);
        System.out.println("Valor de la suma: " + suma);
    }
}
