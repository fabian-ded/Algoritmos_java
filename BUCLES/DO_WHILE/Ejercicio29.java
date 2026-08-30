/* 74. La bloquera “El Milagro” es una pequeña empresa dedicada a la fabricación de bloques de cemento
para construcción. Actualmente cuenta con una plantilla de obreros, cada uno de los cuales tiene un
número X de unidades a producir por semana. La secretaria registra, cada día, el número de bloques
que produjo cada obrero, para totalizar el sábado lo producido en la semana. De cada obrero se
conoce: nombre y cantidad de unidades producidas por día. Desarrolle un programa, que calcule y
muestre:
• Por obrero:
o Nombre
o Total, producido en la semana.
o Porcentaje que representa la producción semanal, respecto al límite
establecido.
• En general:
o Porcentaje de obreros que alcanzaron o superaron el número de unidades
producidas establecidas.
o Nombre del obrero que más produjo y cantidad producida.
o Promedio de producción de la bloquera en la semana. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadObreros;
        int limiteSemanal;

        int obrero = 1;

        int obrerosCumplieron = 0;

        int mayorProduccion = 0;
        String obreroMayor = "";

        int produccionTotalBloquera = 0;

        System.out.println("Ingrese la cantidad de obreros:");
        cantidadObreros = entrada.nextInt();

        System.out.println("Ingrese el límite de unidades a producir por semana:");
        limiteSemanal = entrada.nextInt();

        do {

            entrada.nextLine();

            System.out.println("\n========== OBRERO #" + obrero + " ==========");

            String nombre;

            System.out.println("Ingrese el nombre del obrero:");
            nombre = entrada.nextLine();

            int dia = 1;
            int produccionSemanal = 0;

            do {

                System.out.println(
                        "Ingrese las unidades producidas el día "
                                + dia + ":"
                );

                int produccionDia = entrada.nextInt();

                produccionSemanal += produccionDia;

                dia++;

            } while (dia <= 7);

            double porcentaje =
                    (double) produccionSemanal / limiteSemanal * 100;

            System.out.println("\n----- RESULTADO DEL OBRERO -----");

            System.out.println("Nombre: " + nombre);

            System.out.println(
                    "Total producido en la semana: "
                            + produccionSemanal
            );

            System.out.println(
                    "Porcentaje respecto al límite: "
                            + porcentaje + "%"
            );

            // Verificar si alcanzó o superó el límite
            if (produccionSemanal >= limiteSemanal) {

                obrerosCumplieron++;
            }

            // Determinar el obrero que más produjo
            if (produccionSemanal > mayorProduccion) {

                mayorProduccion = produccionSemanal;
                obreroMayor = nombre;
            }

            // Acumular producción de todos los obreros
            produccionTotalBloquera += produccionSemanal;

            obrero++;

        } while (obrero <= cantidadObreros);

        // Porcentaje de obreros que cumplieron el límite
        double porcentajeCumplieron =
                (double) obrerosCumplieron / cantidadObreros * 100;

        // Promedio de producción
        double promedioProduccion =
                (double) produccionTotalBloquera / cantidadObreros;

        System.out.println("\n========== RESULTADOS GENERALES ==========");

        System.out.println(
                "Porcentaje de obreros que alcanzaron o superaron el límite: "
                        + porcentajeCumplieron + "%"
        );

        System.out.println(
                "Obrero que más produjo: "
                        + obreroMayor
        );

        System.out.println(
                "Cantidad producida por el obrero: "
                        + mayorProduccion
        );

        System.out.println(
                "Promedio de producción semanal de la bloquera: "
                        + promedioProduccion
        );
    }
}
