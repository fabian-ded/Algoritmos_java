/* 80. La Oficina Central de Estadística e Informática (OCEI) desea conocer cierta información sobre la
situación actual del país en cuanto a los niveles actuales de desempleo, analfabetismo y del potencial
de profesionales existentes en Venezuela. Los Estados son identificados por un código entero
positivo de dos (02) dígitos significativos. Las ciudades mediante un código de cuatro (04) dígitos
significativos, de los cuales los dos últimos dígitos corresponden al Estado al cual pertenecen. Los
municipios se identifican con un código de cuatro (06) dígitos significativos, de los cuales los primeros
dígitos corresponden al código de Estado y los dos siguientes dígitos a los dos primeros dígitos del
código de la ciudad en la cual están ubicados. Los datos fueron tomados de personas mayores de 18
años y los mismos son los siguientes: edad; nivel de educación (N: ninguna, B: básica, S: secundaria,
P: profesional); situación actual (D: desempleado, E: empleado). Se requiere que desarrolle un
programa que cumpla con lo siguiente:
• Determinar e imprimir por municipio el código y la cantidad de personas con las siguientes
características: desempleado, sin ningún nivel de educación y mayores de 25 años.

1
7

• Calcular e imprimir el código de las ciudades cuyas personas establecidas en la parte anterior sean
más del 50%.
• Calcular e imprimir el código del Estado con mayor porcentaje de profesionales desempleados. */

package BUCLES.DO_WHILE;

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

        do {

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

            do {

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

                do {

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

                    do {

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

                        /*
                         * Característica solicitada:
                         * desempleado + sin educación + mayor de 25 años.
                         */
                        if (edad > 25
                                && educacion.equalsIgnoreCase("N")
                                && situacion.equalsIgnoreCase("D")) {

                            personasEspecialesMunicipio++;
                            personasEspecialesCiudad++;
                        }

                        /*
                         * Contabilizar profesionales del Estado
                         * y profesionales desempleados.
                         */
                        if (educacion.equalsIgnoreCase("P")) {

                            profesionalesEstado++;

                            if (situacion.equalsIgnoreCase("D")) {

                                profesionalesDesempleadosEstado++;
                            }
                        }

                        persona++;

                    } while (persona <= cantidadPersonas);

                    System.out.println(
                            "\nPersonas desempleadas, sin educación "
                                    + "y mayores de 25 años en el municipio "
                                    + codigoMunicipio + ": "
                                    + personasEspecialesMunicipio
                    );

                    totalPersonasCiudad += cantidadPersonas;

                    municipio++;

                } while (municipio <= cantidadMunicipios);

                /*
                 * Verificar si las personas que cumplen la condición
                 * representan más del 50% de la ciudad.
                 */
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

            } while (ciudad <= cantidadCiudades);

            /*
             * Determinar el Estado con mayor porcentaje
             * de profesionales desempleados.
             */
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
             * Guardamos el Estado que tenga mayor porcentaje.
             */
            if (profesionalesDesempleadosEstado > mayorProfesionalesDesempleados) {

                mayorProfesionalesDesempleados =
                        profesionalesDesempleadosEstado;

                mayorTotalProfesionales = profesionalesEstado;

                estadoMayorProfesionales =
                        String.valueOf(codigoEstado);
            }

            estado++;

        } while (estado <= cantidadEstados);

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
