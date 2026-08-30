/* 70. Una estación climática proporciona un par de temperaturas diarias (máx, min), el rango normal de
temperatura es entre 14 y 30 ° C. La pareja fin de temperaturas es 0,0. Se pide determinar:
g. El número de días cuyas temperaturas se han proporcionado.
h. Las medias máxima y mínima.
i. Número de errores que ingresaron (temperaturas fuera de rango).
j. Porcentaje que representan los errores ingresados. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double temperaturaMaxima;
        double temperaturaMinima;

        int dias = 0;
        int errores = 0;

        double sumaMaximas = 0;
        double sumaMinimas = 0;

        do {

            System.out.println("Ingrese la temperatura máxima:");
            temperaturaMaxima = entrada.nextDouble();

            System.out.println("Ingrese la temperatura mínima:");
            temperaturaMinima = entrada.nextDouble();

            // Verificamos que no sea la pareja 0,0 que termina el programa
            if (temperaturaMaxima != 0 || temperaturaMinima != 0) {

                // Contamos la pareja de temperaturas como un día
                dias++;

                // Verificamos si alguna temperatura está fuera del rango
                if (temperaturaMaxima < 14 || temperaturaMaxima > 30 ||
                        temperaturaMinima < 14 || temperaturaMinima > 30) {

                    errores++;

                } else {

                    // Acumulamos únicamente las temperaturas válidas
                    sumaMaximas += temperaturaMaxima;
                    sumaMinimas += temperaturaMinima;
                }
            }

        } while (temperaturaMaxima != 0 || temperaturaMinima != 0);

        System.out.println("\n========== RESULTADOS ==========");

        // g. Número de días
        System.out.println("g. Número de días proporcionados: " + dias);

        // Verificamos que exista al menos un día válido
        if (dias - errores > 0) {

            // h. Medias máxima y mínima
            double mediaMaxima = sumaMaximas / (dias - errores);
            double mediaMinima = sumaMinimas / (dias - errores);

            System.out.println("h. Media máxima: " + mediaMaxima);
            System.out.println("   Media mínima: " + mediaMinima);

        } else {

            System.out.println("h. No existen temperaturas válidas para calcular las medias.");
        }

        // i. Número de errores
        System.out.println("i. Número de errores: " + errores);

        // j. Porcentaje de errores
        if (dias > 0) {

            double porcentajeErrores = (double) errores / dias * 100;

            System.out.println("j. Porcentaje de errores: "
                    + porcentajeErrores + "%");

        } else {

            System.out.println("j. No se ingresaron días.");
        }
    }
}
