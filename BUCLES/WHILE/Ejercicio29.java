package BUCLES.WHILE;
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

        while (obrero <= cantidadObreros) {

            entrada.nextLine();

            System.out.println("\n========== OBRERO #" + obrero + " ==========");

            String nombre;

            System.out.println("Ingrese el nombre del obrero:");
            nombre = entrada.nextLine();

            int dia = 1;
            int produccionSemanal = 0;

            while (dia <= 7) {

                System.out.println(
                        "Ingrese las unidades producidas el día "
                                + dia + ":"
                );

                int produccionDia = entrada.nextInt();

                produccionSemanal += produccionDia;

                dia++;
            }

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
        }

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
