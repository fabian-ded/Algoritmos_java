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

        int cuestionario = 1;
        double sumaPromedios = 0;

        double promedioMayor = 0;
        double promedioMenor = 5;

        int instrumentoMayor = 0;
        int instrumentoMenor = 0;

        int promedioMenor3 = 0;
        int promedioMayor4 = 0;
        int promedioEntre45y5 = 0;

        do {

            int pregunta = 1;
            int totalPuntos = 0;

            System.out.println("\nCuestionario #" + cuestionario);

            do {

                System.out.println("Ingrese el valor de la pregunta " + pregunta + " (1-5):");
                int respuesta = entrada.nextInt();

                totalPuntos += respuesta;

                pregunta++;

            } while (pregunta <= 23);

            double promedio = (double) totalPuntos / 23;

            System.out.println("Promedio del cuestionario: " + promedio);

            sumaPromedios += promedio;

            if (promedio > promedioMayor) {
                promedioMayor = promedio;
                instrumentoMayor = cuestionario;
            }

            if (promedio < promedioMenor) {
                promedioMenor = promedio;
                instrumentoMenor = cuestionario;
            }

            if (promedio < 3) {
                promedioMenor3++;
            }

            if (promedio > 4) {
                promedioMayor4++;
            }

            if (promedio >= 4.5 && promedio <= 5) {
                promedioEntre45y5++;
            }

            cuestionario++;

        } while (cuestionario <= 64);

        double promedioGeneral = sumaPromedios / 64;

        double porcentajeMenor3RespectoMayor4 =
                (double) promedioMenor3 / promedioMayor4 * 100;

        double porcentajeEntre45y5 =
                (double) promedioEntre45y5 / 64 * 100;

        System.out.println("\n========== RESULTADOS ==========");

        System.out.println("Promedio general: " + promedioGeneral);

        System.out.println(
                "Promedio más alto: " + promedioMayor +
                        " - Instrumento #" + instrumentoMayor
        );

        System.out.println(
                "Promedio más bajo: " + promedioMenor +
                        " - Instrumento #" + instrumentoMenor
        );

        System.out.println(
                "Porcentaje de cuestionarios con promedio inferior a 3 respecto a los superiores a 4: "
                        + porcentajeMenor3RespectoMayor4 + "%"
        );

        System.out.println(
                "Porcentaje de cuestionarios entre 4.5 y 5: "
                        + porcentajeEntre45y5 + "%"
        );
    }
}
