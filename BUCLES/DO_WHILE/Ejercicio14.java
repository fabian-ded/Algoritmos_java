/* Desarrolle un programa que capture las notas del primer parcial de Matemática, Programación
e inglés de un grupo indeterminado de alumnos y calcule e imprima:
a. Nota menor de Programación.
b. Porcentaje de alumnos que no presentaron el examen de inglés, respecto a los que sí
presentaron.
c. Número de alumnos que aprobaron todas las materias.
d. Promedio general en Programación.
e. Porcentaje de alumnos que reprobaron Matemática, respecto al total de alumnos que
presentaron el examen de matemática. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double matematica;
        double programacion;
        double ingles;

        double menorProgramacion = 5;
        double sumaProgramacion = 0;

        int totalAlumnos = 0;
        int inglesNoPresentaron = 0;
        int inglesPresentaron = 0;
        int aprobaronTodas = 0;

        int matematicaPresentaron = 0;
        int matematicaReprobaron = 0;

        String continuar;

        do {

            totalAlumnos++;

            System.out.println("\n===== ALUMNO #" + totalAlumnos + " =====");

            System.out.println("Ingrese la nota de Matemática:");
            matematica = entrada.nextDouble();

            System.out.println("Ingrese la nota de Programación:");
            programacion = entrada.nextDouble();

            System.out.println("Ingrese la nota de Inglés:");
            ingles = entrada.nextDouble();

            // a. Nota menor de Programación
            if (programacion < menorProgramacion) {
                menorProgramacion = programacion;
            }

            // d. Promedio general de Programación
            sumaProgramacion += programacion;

            // b. Alumnos que presentaron o no Inglés
            if (ingles == 0) {
                inglesNoPresentaron++;
            } else {
                inglesPresentaron++;
            }

            // c. Alumnos que aprobaron todas las materias
            if (matematica >= 3 &&
                    programacion >= 3 &&
                    ingles >= 3) {

                aprobaronTodas++;
            }

            // e. Alumnos que presentaron Matemática
            if (matematica != 0) {

                matematicaPresentaron++;

                if (matematica < 3) {
                    matematicaReprobaron++;
                }
            }

            entrada.nextLine();

            System.out.println("¿Desea ingresar otro alumno? (si/no)");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        double promedioProgramacion =
                sumaProgramacion / totalAlumnos;

        double porcentajeIngles =
                (double) inglesNoPresentaron / inglesPresentaron * 100;

        double porcentajeMatematica =
                (double) matematicaReprobaron / matematicaPresentaron * 100;

        System.out.println("\n========== RESULTADOS ==========");

        System.out.println(
                "a. Nota menor de Programación: "
                        + menorProgramacion
        );

        System.out.println(
                "b. Porcentaje de alumnos que no presentaron Inglés respecto a los que sí presentaron: "
                        + porcentajeIngles + "%"
        );

        System.out.println(
                "c. Número de alumnos que aprobaron todas las materias: "
                        + aprobaronTodas
        );

        System.out.println(
                "d. Promedio general en Programación: "
                        + promedioProgramacion
        );

        System.out.println(
                "e. Porcentaje de alumnos que reprobaron Matemática respecto a los que presentaron: "
                        + porcentajeMatematica + "%"
        );
    }
}
