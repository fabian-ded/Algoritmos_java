/* En una encuesta de alumnos se tomaron los siguientes datos: edad, sexo, estado civil, y especialidad
que cursa. La empresa encuestadora, desea generar las siguientes estadísticas:

1
2

a. Promedio de edad de las mujeres.
b. Promedio de edad de los hombres.
c. Cantidad de hombres y de mujeres encuestados.
d. Porcentaje de personas para cada uno de los tipos de estado civil, respecto al total.
e. Cantidad de alumnos por especialidad y porcentaje que representan.
f. Porcentaje de mujeres adultas, tomando en cuenta que los adultos son los que tienen más
de 21 años.
g. Porcentaje de hombres jóvenes, tomando en cuenta que estos son los que tienen menos
de 21 años, pero más de 17.
h. Cantidad de hombres solteros y cantidad de mujeres solteras. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;
        String sexo;
        int estadoCivil;
        String especialidad;

        int totalAlumnos = 0;

        // Contadores de hombres y mujeres
        int totalHombres = 0;
        int totalMujeres = 0;

        // Acumuladores de edades
        int sumaEdadHombres = 0;
        int sumaEdadMujeres = 0;

        // Estados civiles
        int solteros = 0;
        int casados = 0;
        int divorciados = 0;
        int viudos = 0;

        // Especialidades
        int programacion = 0;
        int sistemas = 0;
        int administracion = 0;

        // Mujeres adultas y hombres jóvenes
        int mujeresAdultas = 0;
        int hombresJovenes = 0;

        // Solteros por sexo
        int hombresSolteros = 0;
        int mujeresSolteras = 0;

        String continuar;

        do {

            totalAlumnos++;

            System.out.println("\n===== ALUMNO #" + totalAlumnos + " =====");

            System.out.println("Ingrese la edad:");
            edad = entrada.nextInt();

            entrada.nextLine();

            System.out.println("Ingrese el sexo (H/M):");
            sexo = entrada.nextLine();

            System.out.println("Ingrese el estado civil:");
            System.out.println("1 = Soltero");
            System.out.println("2 = Casado");
            System.out.println("3 = Divorciado");
            System.out.println("4 = Viudo");
            estadoCivil = entrada.nextInt();

            entrada.nextLine();

            System.out.println("Ingrese la especialidad:");
            System.out.println("Programacion");
            System.out.println("Sistemas");
            System.out.println("Administracion");
            especialidad = entrada.nextLine();

            if (sexo.equalsIgnoreCase("H")) {

                totalHombres++;

                sumaEdadHombres += edad;

                // Hombres jóvenes: mayores de 17 y menores de 21
                if (edad > 17 && edad < 21) {
                    hombresJovenes++;
                }

                // Hombres solteros
                if (estadoCivil == 1) {
                    hombresSolteros++;
                }
            }

            if (sexo.equalsIgnoreCase("M")) {

                totalMujeres++;

                sumaEdadMujeres += edad;

                // Mujeres adultas: mayores de 21
                if (edad > 21) {
                    mujeresAdultas++;
                }

                // Mujeres solteras
                if (estadoCivil == 1) {
                    mujeresSolteras++;
                }
            }

            switch (estadoCivil) {

                case 1:
                    solteros++;
                    break;

                case 2:
                    casados++;
                    break;

                case 3:
                    divorciados++;
                    break;

                case 4:
                    viudos++;
                    break;
            }

            if (especialidad.equalsIgnoreCase("Programacion")) {
                programacion++;
            } else if (especialidad.equalsIgnoreCase("Sistemas")) {
                sistemas++;
            } else if (especialidad.equalsIgnoreCase("Administracion")) {
                administracion++;
            }

            entrada.nextLine();

            System.out.println("\n¿Desea ingresar otro alumno? (si/no)");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        double promedioMujeres =
                (double) sumaEdadMujeres / totalMujeres;

        double promedioHombres =
                (double) sumaEdadHombres / totalHombres;

        double porcentajeSolteros =
                (double) solteros / totalAlumnos * 100;

        double porcentajeCasados =
                (double) casados / totalAlumnos * 100;

        double porcentajeDivorciados =
                (double) divorciados / totalAlumnos * 100;

        double porcentajeViudos =
                (double) viudos / totalAlumnos * 100;

        double porcentajeProgramacion =
                (double) programacion / totalAlumnos * 100;

        double porcentajeSistemas =
                (double) sistemas / totalAlumnos * 100;

        double porcentajeAdministracion =
                (double) administracion / totalAlumnos * 100;

        double porcentajeMujeresAdultas =
                (double) mujeresAdultas / totalMujeres * 100;

        double porcentajeHombresJovenes =
                (double) hombresJovenes / totalHombres * 100;

        System.out.println("\n========== RESULTADOS ==========");

        System.out.println("a. Promedio de edad de las mujeres: "
                + promedioMujeres);

        System.out.println("b. Promedio de edad de los hombres: "
                + promedioHombres);

        System.out.println("c. Cantidad de hombres: "
                + totalHombres);

        System.out.println("   Cantidad de mujeres: "
                + totalMujeres);

        System.out.println("d. Porcentaje de solteros: "
                + porcentajeSolteros + "%");

        System.out.println("   Porcentaje de casados: "
                + porcentajeCasados + "%");

        System.out.println("   Porcentaje de divorciados: "
                + porcentajeDivorciados + "%");

        System.out.println("   Porcentaje de viudos: "
                + porcentajeViudos + "%");

        System.out.println("e. Programacion: "
                + programacion + " alumnos - "
                + porcentajeProgramacion + "%");

        System.out.println("   Sistemas: "
                + sistemas + " alumnos - "
                + porcentajeSistemas + "%");

        System.out.println("   Administracion: "
                + administracion + " alumnos - "
                + porcentajeAdministracion + "%");

        System.out.println("f. Porcentaje de mujeres adultas: "
                + porcentajeMujeresAdultas + "%");

        System.out.println("g. Porcentaje de hombres jóvenes: "
                + porcentajeHombresJovenes + "%");

        System.out.println("h. Hombres solteros: "
                + hombresSolteros);

        System.out.println("   Mujeres solteras: "
                + mujeresSolteras);
    }
}
