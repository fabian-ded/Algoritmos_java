/* 71. La UNICEF desea obtener información estadística sobre los orfanatorios ubicados dentro de la
República y sobre los niños huérfanos internados en esos orfanatorios. Por cada niño se conoce:
sexo, edad, nombre del orfanatorio y estado de la República al que pertenece el Orfanatorio. Escriba
un Programa para calcular y mostrar lo siguiente:
a. Porcentaje de huérfanos del Estado Táchira y del Distrito Capital respecto al total del País.
b. Número de huérfanos en cada grupo. Los grupos se definen según la Edad:
Grupo 1: menores de 1 año
Grupo 2: edad comprendida entre 1 y 3 años
Grupo 3: edad comprendida entre 4 y 6 años
Grupo 4: mayores de 6 años
c. Cantidad de niños y niñas y porcentaje que representa cada uno. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadNinos;
        int contador = 0;

        String sexo;
        int edad;
        String orfanatorio;
        String estado;

        int totalHuerfanos = 0;
        int tachira = 0;
        int distritoCapital = 0;

        int grupo1 = 0;
        int grupo2 = 0;
        int grupo3 = 0;
        int grupo4 = 0;

        int ninos = 0;
        int ninas = 0;

        System.out.println("Ingrese la cantidad de niños huérfanos:");
        cantidadNinos = entrada.nextInt();

        do {

            contador++;
            totalHuerfanos++;

            System.out.println("\n========== HUÉRFANO #" + contador + " ==========");

            entrada.nextLine();

            System.out.println("Ingrese el sexo (M/F):");
            sexo = entrada.nextLine();

            System.out.println("Ingrese la edad:");
            edad = entrada.nextInt();

            entrada.nextLine();

            System.out.println("Ingrese el nombre del orfanatorio:");
            orfanatorio = entrada.nextLine();

            System.out.println("Ingrese el estado:");
            estado = entrada.nextLine();

            // Contar huérfanos del Táchira
            if (estado.equalsIgnoreCase("Tachira")) {
                tachira++;
            }

            // Contar huérfanos del Distrito Capital
            if (estado.equalsIgnoreCase("Distrito Capital")) {
                distritoCapital++;
            }

            // Clasificar por grupo de edad
            if (edad < 1) {

                grupo1++;

            } else if (edad >= 1 && edad <= 3) {

                grupo2++;

            } else if (edad >= 4 && edad <= 6) {

                grupo3++;

            } else if (edad > 6) {

                grupo4++;
            }

            // Contar niños y niñas
            if (sexo.equalsIgnoreCase("M")) {

                ninos++;

            } else if (sexo.equalsIgnoreCase("F")) {

                ninas++;
            }

        } while (contador < cantidadNinos);

        // Porcentajes de Táchira y Distrito Capital
        double porcentajeTachira =
                (double) tachira / totalHuerfanos * 100;

        double porcentajeDistritoCapital =
                (double) distritoCapital / totalHuerfanos * 100;

        // Porcentajes de niños y niñas
        double porcentajeNinos =
                (double) ninos / totalHuerfanos * 100;

        double porcentajeNinas =
                (double) ninas / totalHuerfanos * 100;

        System.out.println("\n========== RESULTADOS ==========");

        // a
        System.out.println("\na. Huérfanos del Estado Táchira: "
                + tachira);

        System.out.println("Porcentaje de Táchira: "
                + porcentajeTachira + "%");

        System.out.println("Huérfanos del Distrito Capital: "
                + distritoCapital);

        System.out.println("Porcentaje del Distrito Capital: "
                + porcentajeDistritoCapital + "%");

        // b
        System.out.println("\nb. Huérfanos por grupo de edad:");

        System.out.println("Grupo 1 - Menores de 1 año: "
                + grupo1);

        System.out.println("Grupo 2 - Entre 1 y 3 años: "
                + grupo2);

        System.out.println("Grupo 3 - Entre 4 y 6 años: "
                + grupo3);

        System.out.println("Grupo 4 - Mayores de 6 años: "
                + grupo4);

        // c
        System.out.println("\nc. Cantidad de niños: " + ninos);
        System.out.println("Porcentaje de niños: "
                + porcentajeNinos + "%");

        System.out.println("Cantidad de niñas: " + ninas);
        System.out.println("Porcentaje de niñas: "
                + porcentajeNinas + "%");
    }
}
