package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadEstados;
        int estado = 1;

        int mayorProfesionalesDesempleados = 0;
        int mayorTotalProfesionales = 0;
        String estadoMayorProfesionales = "";

        System.out.println("Ingrese la cantidad de Estados:");
        cantidadEstados = entrada.nextInt();

        while (estado <= cantidadEstados) {

            System.out.println("\n========== ESTADO #" + estado + " ==========");

            int codigoEstado;
            int cantidadCiudades;

            System.out.println("Ingrese el código del Estado:");
            codigoEstado = entrada.nextInt();

            System.out.println("Ingrese la cantidad de ciudades:");
            cantidadCiudades = entrada.nextInt();

            int ciudad = 1;

            int profesionalesDesempleadosEstado = 0;
            int profesionalesEstado = 0;

            while (ciudad <= cantidadCiudades) {

                System.out.println(
                        "\n---------- CIUDAD #" + ciudad + " ----------"
                );

                int codigoCiudad;
                int cantidadMunicipios;

                System.out.println("Ingrese el código de la ciudad:");
                codigoCiudad = entrada.nextInt();

                System.out.println("Ingrese la cantidad de municipios:");
                cantidadMunicipios = entrada.nextInt();

                int municipio = 1;

                int personasEspecialesCiudad = 0;
                int totalPersonasCiudad = 0;

                while (municipio <= cantidadMunicipios) {

                    System.out.println(
                            "\n------ MUNICIPIO #" + municipio + " ------"
                    );

                    int codigoMunicipio;
                    int cantidadPersonas;

                    System.out.println("Ingrese el código del municipio:");
                    codigoMunicipio = entrada.nextInt();

                    System.out.println(
                            "Ingrese la cantidad de personas del municipio:"
                    );

                    cantidadPersonas = entrada.nextInt();

                    int persona = 1;

                    int personasEspecialesMunicipio = 0;

                    while (persona <= cantidadPersonas) {

                        System.out.println(
                                "\nPersona #" + persona
                        );

                        System.out.println("Ingrese la edad:");
                        int edad = entrada.nextInt();

                        System.out.println(
                                "Ingrese el nivel de educación:"
                                        + "\nN = Ninguna"
                                        + "\nB = Básica"
                                        + "\nS = Secundaria"
                                        + "\nP = Profesional"
                        );

                        String educacion = entrada.next();

                        System.out.println(
                                "Ingrese la situación actual:"
                                        + "\nD = Desempleado"
                                        + "\nE = Empleado"
                        );

                        String situacion = entrada.next();

                        if (edad > 25
                                && educacion.equalsIgnoreCase("N")
                                && situacion.equalsIgnoreCase("D")) {

                            personasEspecialesMunicipio++;
                            personasEspecialesCiudad++;
                        }

                        if (educacion.equalsIgnoreCase("P")) {

                            profesionalesEstado++;

                            if (situacion.equalsIgnoreCase("D")) {

                                profesionalesDesempleadosEstado++;
                            }
                        }

                        persona++;
                    }

                    System.out.println(
                            "\nPersonas desempleadas, sin educación "
                                    + "y mayores de 25 años en el municipio "
                                    + codigoMunicipio + ": "
                                    + personasEspecialesMunicipio
                    );

                    totalPersonasCiudad += cantidadPersonas;

                    municipio++;
                }

                double porcentajeCiudad = 0;

                if (totalPersonasCiudad > 0) {

                    porcentajeCiudad =
                            (double) personasEspecialesCiudad
                                    / totalPersonasCiudad * 100;
                }

                if (porcentajeCiudad > 50) {

                    System.out.println(
                            "La ciudad " + codigoCiudad
                                    + " tiene más del 50% "
                                    + "de personas con la característica."
                    );
                }

                ciudad++;
            }

            double porcentajeProfesionalesDesempleados = 0;

            if (profesionalesEstado > 0) {

                porcentajeProfesionalesDesempleados =
                        (double) profesionalesDesempleadosEstado
                                / profesionalesEstado * 100;
            }

            System.out.println(
                    "\nPorcentaje de profesionales desempleados "
                            + "del Estado " + codigoEstado + ": "
                            + porcentajeProfesionalesDesempleados + "%"
            );

            /*
             * Guardamos el Estado con mayor porcentaje.
             */
            if (porcentajeProfesionalesDesempleados >
                    (mayorTotalProfesionales > 0
                            ? (double) mayorProfesionalesDesempleados
                            / mayorTotalProfesionales * 100
                            : -1)) {

                mayorProfesionalesDesempleados =
                        profesionalesDesempleadosEstado;

                mayorTotalProfesionales =
                        profesionalesEstado;

                estadoMayorProfesionales =
                        String.valueOf(codigoEstado);
            }

            estado++;
        }

        System.out.println(
                "\n========== RESULTADO FINAL =========="
        );

        if (!estadoMayorProfesionales.isEmpty()) {

            double porcentajeMayor =
                    (double) mayorProfesionalesDesempleados
                            / mayorTotalProfesionales * 100;

            System.out.println(
                    "Estado con mayor porcentaje de profesionales "
                            + "desempleados: "
                            + estadoMayorProfesionales
            );

            System.out.println(
                    "Porcentaje: " + porcentajeMayor + "%"
            );
        }
    }
}
