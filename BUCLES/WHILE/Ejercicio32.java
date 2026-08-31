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
        int menorPoblacion = Integer.MAX_VALUE;

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

                System.out.println(
                        "Ingrese la cantidad de habitantes del municipio #"
                                + municipio + ":"
                );

                int habitantes = entrada.nextInt();

                poblacionEstado += habitantes;

                municipio++;
            }

            System.out.println(
                    "Población del Estado " + nombreEstado + ": "
                            + poblacionEstado
            );

            // Buscar el Estado con mayor población
            if (poblacionEstado > mayorPoblacion) {

                mayorPoblacion = poblacionEstado;
                estadoMayor = nombreEstado;
            }

            // Buscar el Estado con menor población
            if (poblacionEstado < menorPoblacion) {

                menorPoblacion = poblacionEstado;
                estadoMenor = nombreEstado;
            }

            // Acumular población de los 5 Estados
            totalCincoEstados += poblacionEstado;

            estado++;

            entrada.nextLine();
        }

        /*
         * Se solicita el total de habitantes del País
         * para poder calcular el porcentaje.
         */
        System.out.println("\nIngrese la población total del País:");
        int poblacionPais = entrada.nextInt();

        // Porcentaje de los 5 Estados respecto al País
        double porcentaje =
                (double) totalCincoEstados / poblacionPais * 100;

        // Promedio de habitantes por Estado
        double promedio =
                (double) totalCincoEstados / 5;

        System.out.println("\n========== RESULTADOS ==========");

        System.out.println(
                "a. Estado con mayor población: "
                        + estadoMayor
                        + " - "
                        + mayorPoblacion
                        + " habitantes"
        );

        System.out.println(
                "b. Estado con menor población: "
                        + estadoMenor
                        + " - "
                        + menorPoblacion
                        + " habitantes"
        );

        System.out.println(
                "c. Porcentaje de habitantes de los 5 Estados respecto al País: "
                        + porcentaje + "%"
        );

        System.out.println(
                "d. Promedio de habitantes por Estado: "
                        + promedio
        );
    }
}
