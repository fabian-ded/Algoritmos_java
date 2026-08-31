package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;
        String sexo;
        int estadoCivil;
        String especialidad;

        int totalAlumnos = 0;

        int totalHombres = 0;
        int totalMujeres = 0;

        int sumaEdadHombres = 0;
        int sumaEdadMujeres = 0;

        int solteros = 0;
        int casados = 0;
        int divorciados = 0;
        int viudos = 0;

        int programacion = 0;
        int sistemas = 0;
        int administracion = 0;

        int mujeresAdultas = 0;
        int hombresJovenes = 0;

        int hombresSolteros = 0;
        int mujeresSolteras = 0;

        String continuar = "si";

        while (continuar.equalsIgnoreCase("si")) {

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

                if (edad > 17 && edad < 21) {
                    hombresJovenes++;
                }

                if (estadoCivil == 1) {
                    hombresSolteros++;
                }
            }

            if (sexo.equalsIgnoreCase("M")) {

                totalMujeres++;

                sumaEdadMujeres += edad;

                if (edad > 21) {
                    mujeresAdultas++;
                }

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
        }

        double promedioMujeres = 0;
        double promedioHombres = 0;

        if (totalMujeres > 0) {
            promedioMujeres =
                    (double) sumaEdadMujeres / totalMujeres;
        }

        if (totalHombres > 0) {
            promedioHombres =
                    (double) sumaEdadHombres / totalHombres;
        }

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

        double porcentajeMujeresAdultas = 0;
        double porcentajeHombresJovenes = 0;

        if (totalMujeres > 0) {
            porcentajeMujeresAdultas =
                    (double) mujeresAdultas / totalMujeres * 100;
        }

        if (totalHombres > 0) {
            porcentajeHombresJovenes =
                    (double) hombresJovenes / totalHombres * 100;
        }

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
