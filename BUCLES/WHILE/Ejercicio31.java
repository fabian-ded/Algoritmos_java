package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadGrupos;
        int grupo = 1;

        double sumaPromediosGrupos = 0;

        System.out.println("Ingrese la cantidad de grupos:");
        cantidadGrupos = entrada.nextInt();

        while (grupo <= cantidadGrupos) {

            System.out.println("\n========== GRUPO #" + grupo + " ==========");

            int cantidadAlumnos;
            int alumno = 1;

            double sumaPromediosAlumnos = 0;

            System.out.println("Ingrese la cantidad de alumnos del grupo:");
            cantidadAlumnos = entrada.nextInt();

            while (alumno <= cantidadAlumnos) {

                System.out.println("\n------ ALUMNO #" + alumno + " ------");

                int cantidadMaterias;
                int materia = 1;

                double sumaPromediosMaterias = 0;

                System.out.println("Ingrese la cantidad de materias del alumno:");
                cantidadMaterias = entrada.nextInt();

                while (materia <= cantidadMaterias) {

                    System.out.println("\nMateria #" + materia);

                    int calificacion = 1;
                    double sumaCalificaciones = 0;

                    while (calificacion <= 3) {

                        System.out.println(
                                "Ingrese la calificación #" + calificacion + ":"
                        );

                        double nota = entrada.nextDouble();

                        sumaCalificaciones += nota;

                        calificacion++;
                    }

                    double promedioMateria = sumaCalificaciones / 3;

                    System.out.println(
                            "Promedio de la materia: "
                                    + promedioMateria
                    );

                    sumaPromediosMaterias += promedioMateria;

                    materia++;
                }

                // Promedio del alumno
                double promedioAlumno =
                        sumaPromediosMaterias / cantidadMaterias;

                System.out.println(
                        "Promedio del alumno #" + alumno + ": "
                                + promedioAlumno
                );

                sumaPromediosAlumnos += promedioAlumno;

                alumno++;
            }

            // Promedio del grupo
            double promedioGrupo =
                    sumaPromediosAlumnos / cantidadAlumnos;

            System.out.println(
                    "\nPromedio del grupo #" + grupo + ": "
                            + promedioGrupo
            );

            sumaPromediosGrupos += promedioGrupo;

            grupo++;
        }

        // Promedio general de todos los grupos
        double promedioGeneral =
                sumaPromediosGrupos / cantidadGrupos;

        System.out.println(
                "\n========== RESULTADO GENERAL =========="
        );

        System.out.println(
                "Promedio general de todos los grupos: "
                        + promedioGeneral
        );
    }
}
