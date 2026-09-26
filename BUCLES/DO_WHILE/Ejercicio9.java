/* Un investigador acaba de aplicar 64 cuestionarios de 23 preguntas cada uno; donde cada pregunta
permite escoger entre 1 y 5, a un grupo de personas que constituyen su población. Se desea que
elabore un Programa, para ayudar al Investigador a procesar toda la información recopilada, para
ello tome en cuenta lo siguiente: necesita calcular el promedio de cada instrumento o escala para lo
cual es necesaria la fórmula: PT/NT, donde PT representa el total de puntos de cada cuestionario que
resulta de sumar los valores que el encuestado, encerró entre un círculo y NT es el total de preguntas
del instrumento. Estos valores se deben acumular, para al final calcular y mostrar lo siguiente:
a. La media o promedio de todos los cuestionarios (promedio general).
b. El promedio más alto obtenido y número de instrumento a que corresponde.
c. El promedio más bajo obtenido y número de instrumento a que corresponde.
d. Porcentaje de cuestionarios que obtuvieron un promedio inferior a 3, respecto a los que tuvieron un
promedio superior a 4.
e. Porcentaje de cuestionarios que obtuvieron un promedio entre 4.5 y 5 respecto al total procesado. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a = 0, e = 1, i = 1, o = 0;
        int preguntas = 0;
        double estandar = 0;
        double guardador = 0;
        double estandarmenor = 0;
        double por_mayor = 0;
        double por_menor = 0;
        int ubi1 = 0;
        int ubi2 = 0;

        do {

            System.out.println("Cuestionario numero " + i);
            e = 1;
            do {
                System.out.println("Pregunta numero " + e );
                System.out.println("Cuanto puntaje tubo en la pregunta 1:");
                int pre1 = entrada.nextInt();
                System.out.println("Cuanto puntaje tubo en la pregunta 2:");
                int pre2 = entrada.nextInt();
                System.out.println("Cuanto puntaje tubo en la pregunta 3:");
                int pre3 = entrada.nextInt();
                System.out.println("Cuanto puntaje tubo en la pregunta 4:");
                int pre4 = entrada.nextInt();
                System.out.println("Cuanto puntaje tubo en la pregunta 5:");
                int pre5 = entrada.nextInt();

                guardador += pre1 + pre2 + pre3 + pre4 + pre5;
                preguntas = pre1 + pre2 + pre3 + pre4 + pre5;

                e++;
            }while (e <= 5);

            por_mayor = (double)preguntas/e;
            if (por_mayor > estandar){
                estandar = por_mayor;
                ubi1 = i;
            }

            por_menor = (double)preguntas/e;
            if (por_menor < estandarmenor){
                estandarmenor = por_menor;
                ubi2 = i;
            }

            if (por_menor < 3){
                a++;
            }

            if (por_mayor > 4){
                o++;
            }

            i++;
        }while (i <= 3);

        System.out.println("El promedio de todos los cuestionarios es de: " + guardador);
        System.out.println("El promedio mas alto obtenido es de: " + estandar + " y su ubicacion es " + ubi1);
        System.out.println("El promedio mas bajo obtenido es de: " + estandarmenor + " y su ubicacion es " + ubi2);

        double prom_menor = ((double)i/a)/100;
        System.out.println("El promedio de cuestionarios que tuvieron menor que 3 es :" + prom_menor);

        double prom_mayor = ((double)i*o)/100;
        System.out.println("El promedio de cuestionarios que tuvieron mayor de 4,5 es :" + prom_mayor);

    }
}
