/* Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo
de estudiantes. */

public class Algoritmo_six {
    public static void main(String[] args) {
        double hombres;
        double mujeres;
        System.out.println("Cuantos estudiantes hay en el grupo: ");
        hombres = Double.parseDouble(System.console().readLine());
        System.out.println("Cuantos estudiantes hay en el grupo: ");
        mujeres = Double.parseDouble(System.console().readLine());
        double estudiantes = (hombres + mujeres);
        double Por_hombres = (hombres / estudiantes)*100;
        double Por_mujeres = (mujeres / estudiantes)*100;
        System.out.println("El total de hombres es de: " + Por_hombres);
        System.out.println("Y el total de mujeres es de: " + Por_mujeres);
    }
}