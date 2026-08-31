package BUCLES.WHILE;

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

        while (cuestionario <= 64){

            int pregunta = 1;
            int totalPuntos = 0;

            System.out.println("\nCuestionario #" + cuestionario);
            while (pregunta <= 23){
                System.out.println("Ingrese el valor de la pregunta " + pregunta + " (1-5):");
                int respuesta = entrada.nextInt();

                totalPuntos += respuesta;

                pregunta++;
            }
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
        }
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
                        + porcentajeEntre45y5 + "%");
    }
}
