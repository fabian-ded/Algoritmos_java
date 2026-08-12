package ALGORITMOS;
/* Calcule y muestre, a un alumno, cuál será su promedio general en las tres materias más difíciles que
cursa y cuál será el promedio que obtendrá en cada una de ellas. Estas materias se evalúan como se
muestra a continuación:
Matemática Examen 90% y 10% del promedio de tres tareas.
Física Examen 80% y 20% del promedio de dos tareas.
Química Examen 85% y 15% del promedio de tres tareas. */

public class Algoritmo_twelve {
    public static void main(String[] args) {

        double examen_matematica;
        double tarea_mat1;
        double tarea_mat2;
        double tarea_mat3;

        System.out.println("Ingresar nota del examen de matematica: ");
        examen_matematica = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar nota de la tarea 1 de matematica: ");
        tarea_mat1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar nota de la tarea 2 de matematica: ");
        tarea_mat2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar nota de la tarea 3 de matematica: ");
        tarea_mat3 = Double.parseDouble(System.console().readLine());

        double promedio_tareas_mat = (tarea_mat1 + tarea_mat2 + tarea_mat3) / 3;
        double promedio_matematica = (examen_matematica * 0.90) + (promedio_tareas_mat * 0.10);


        double examen_fisica;
        double tarea_fis1;
        double tarea_fis2;

        System.out.println("Ingresar nota del examen de fisica: ");
        examen_fisica = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar nota de la tarea 1 de fisica: ");
        tarea_fis1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar nota de la tarea 2 de fisica: ");
        tarea_fis2 = Double.parseDouble(System.console().readLine());

        double promedio_tareas_fis = (tarea_fis1 + tarea_fis2) / 2;
        double promedio_fisica = (examen_fisica * 0.80) + (promedio_tareas_fis * 0.20);


        double examen_quimica;
        double tarea_qui1;
        double tarea_qui2;
        double tarea_qui3;

        System.out.println("Ingresar nota del examen de quimica: ");
        examen_quimica = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar nota de la tarea 1 de quimica: ");
        tarea_qui1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar nota de la tarea 2 de quimica: ");
        tarea_qui2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar nota de la tarea 3 de quimica: ");
        tarea_qui3 = Double.parseDouble(System.console().readLine());

        double promedio_tareas_qui = (tarea_qui1 + tarea_qui2 + tarea_qui3) / 3;
        double promedio_quimica = (examen_quimica * 0.85) + (promedio_tareas_qui * 0.15);


        double promedio_general = (promedio_matematica + promedio_fisica + promedio_quimica) / 3;

        System.out.println("El promedio de matematica es: " + promedio_matematica);
        System.out.println("El promedio de fisica es: " + promedio_fisica);
        System.out.println("El promedio de quimica es: " + promedio_quimica);
        System.out.println("El promedio general es: " + promedio_general);
    }
}