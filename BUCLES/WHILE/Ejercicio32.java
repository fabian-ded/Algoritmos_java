/* 77. Desarrolle un algoritmo o programa que partiendo de la cantidad de habitantes que tiene cada uno
de los M municipios de los 5 principales Estados del País, calcule y muestre:
a. Estado con mayor población (nombre y cantidad),
b. Estado con menor población (nombre y cantidad),
c. Porcentaje que representan el total de los habitantes de los 5 Estados, respecto al total del
País y
d. Promedio de habitantes por Estado. */

package BUCLES.WHILE;

import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int estado = 1;
        int cantidadMunicipios;

        String estadoMayor = "";
        String estadoMenor = "";

        int mayorPoblacion = 0;
        int menorPoblacion = 0;

        int totalCincoEstados = 0;

        while (estado <= 5) {

            System.out.println("\n========== ESTADO #" + estado + " ==========");

            System.out.println("Ingrese el nombre del Estado:");
            String nombreEstado = entrada.nextLine();

            System.out.println("Ingrese la cantidad de municipios:");
            cantidadMunicipios = entrada.nextInt();

            int municipio = 1;
            int poblacionEstado = 0;

            while (municipio <= cantidadMunicipios) {
                System.out.println("Ingrese la cantidad de habitantes del municipio #" + municipio + ":");
                int habitantes = entrada.nextInt();
                poblacionEstado += habitantes;
                municipio++;
            }

            System.out.println("Población del Estado " + nombreEstado + ": " + poblacionEstado);

            if (estado == 1) {

                mayorPoblacion = poblacionEstado;
                menorPoblacion = poblacionEstado;

                estadoMayor = nombreEstado;
                estadoMenor = nombreEstado;

            } else {

                if (poblacionEstado > mayorPoblacion) {
                    mayorPoblacion = poblacionEstado;
                    estadoMayor = nombreEstado;
                }

                if (poblacionEstado < menorPoblacion) {
                    menorPoblacion = poblacionEstado;
                    estadoMenor = nombreEstado;
                }
            }
            totalCincoEstados += poblacionEstado;
            estado++;
            entrada.nextLine();
        }

        System.out.println("\nIngrese la población total del País:");
        int poblacionPais = entrada.nextInt();
        double porcentaje = (double) totalCincoEstados / poblacionPais * 100;
        double promedio = (double) totalCincoEstados / 5;
        System.out.println("\n========== RESULTADOS ==========");
        System.out.println("a. Estado con mayor población: " + estadoMayor + " - " + mayorPoblacion + " habitantes");
        System.out.println("b. Estado con menor población: " + estadoMenor + " - " + menorPoblacion + " habitantes");
        System.out.println("c. Porcentaje de habitantes de los 5 Estados respecto al País: " + porcentaje + "%");
        System.out.println("d. Promedio de habitantes por Estado: " + promedio);
    }
}