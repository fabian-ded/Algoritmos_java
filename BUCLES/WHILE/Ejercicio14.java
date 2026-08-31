package BUCLES.WHILE;
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

        String continuar = "si";

        while (continuar.equalsIgnoreCase("si")) {

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
        }

        double promedioProgramacion =
                sumaProgramacion / totalAlumnos;

        double porcentajeIngles = 0;

        if (inglesPresentaron > 0) {
            porcentajeIngles =
                    (double) inglesNoPresentaron / inglesPresentaron * 100;
        }

        double porcentajeMatematica = 0;

        if (matematicaPresentaron > 0) {
            porcentajeMatematica =
                    (double) matematicaReprobaron / matematicaPresentaron * 100;
        }

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
