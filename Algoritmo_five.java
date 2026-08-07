/* Un alumno desea saber cuál será su calificación final en la materia de computación. Dicha calificación
se compone de los siguientes porcentajes: 55% del promedio de sus tres calificaciones parciales,
30% de la calificación del examen final y 15% de la calificación de un trabajo final. */
public class Algoritmo_five {
    public static void main(String[] args) {
        double nota_1;
        double nota_2;
        double nota_3;
        double nota_examen;
        double nota_trabajo_final;
        System.out.println("Nota numero 1: ");
        nota_1 = Double.parseDouble(System.console().readLine());
        System.out.println("Nota numero 2: ");
        nota_2 = Double.parseDouble(System.console().readLine());
        System.out.println("Nota numero 3: ");
        nota_3 = Double.parseDouble(System.console().readLine());
        System.out.println("Nota evaluacion: ");
        nota_examen = Double.parseDouble(System.console().readLine());
        System.out.println("Nota trabajo final: ");
        nota_trabajo_final = Double.parseDouble(System.console().readLine());
        double notas = (nota_1 + nota_2 + nota_3)/3;
        double porcentaje_nota = (notas*0.55);
        double porcentaje_evaluacion = (nota_examen*0.30);
        double porcentaje_trabajo = (nota_trabajo_final*0.15);
        double nota_final = (porcentaje_nota + porcentaje_evaluacion + porcentaje_trabajo);
        System.out.println("Nota final: " + nota_final);
    }
}