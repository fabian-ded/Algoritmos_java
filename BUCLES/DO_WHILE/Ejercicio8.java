/* Una empresa requiere realizar el cálculo de la nómina semanal de un conjunto M de empleados; para
ello dispone que los datos de entrada son: nombre, nacionalidad (V o E), edad, tipo de empleado
(1,2,3) y número de horas trabajadas. Con esta información se desea calcular e imprimir:
a. Sueldo básico o bruto. Considere para ello que el pago por hora depende del tipo de
empleado, según la siguiente distribución:
• Si el tipo empleado es 1 Bs. 5000
• Si el tipo empleado es 2 Bs. 10000
• Si el tipo empleado es 3 Bs. 15000
b. Seguro Social, que corresponde al 3% del Sueldo Básico, si éste último es mayor a 100000.
c. Total, de venezolanos por tipo de empleado.
d. Total, de Extranjeros cuya edad es impar.
e. Promedio de edad de todos los empleados.
f. Total, general a pagar en sueldos.  */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num_empleados;
        int contador = 0;

        String nombre;
        String nacionalidad;

        int edad;
        int tipo;
        int horas;

        int totalVenezolanosTipo1 = 0;
        int totalVenezolanosTipo2 = 0;
        int totalVenezolanosTipo3 = 0;

        int extranjerosEdadImpar = 0;

        int sumaEdades = 0;
        double totalSueldos = 0;

        System.out.println("Ingrese el número de empleados:");
        num_empleados = entrada.nextInt();
        entrada.nextLine();

        do {

            contador++;

            System.out.println("Empleado #" + contador);

            System.out.println("Ingrese el nombre:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la nacionalidad (V/E):");
            nacionalidad = entrada.nextLine();

            System.out.println("Ingrese la edad:");
            edad = entrada.nextInt();

            System.out.println("Ingrese el tipo de empleado (1, 2 o 3):");
            tipo = entrada.nextInt();

            System.out.println("Ingrese las horas trabajadas:");
            horas = entrada.nextInt();

            double sueldo = 0;
            double seguro = 0;

            switch (tipo) {

                case 1:
                    sueldo = 5000 * horas;

                    if (nacionalidad.equalsIgnoreCase("V")) {
                        totalVenezolanosTipo1++;
                    }
                    break;

                case 2:
                    sueldo = 10000 * horas;

                    if (nacionalidad.equalsIgnoreCase("V")) {
                        totalVenezolanosTipo2++;
                    }
                    break;

                case 3:
                    sueldo = 15000 * horas;

                    if (nacionalidad.equalsIgnoreCase("V")) {
                        totalVenezolanosTipo3++;
                    }
                    break;
            }

            if (sueldo > 100000) {
                seguro = sueldo * 0.03;
            }

            if (nacionalidad.equalsIgnoreCase("E") && edad % 2 != 0) {
                extranjerosEdadImpar++;
            }

            sumaEdades += edad;

            totalSueldos += sueldo;

            System.out.println("Nombre: " + nombre);
            System.out.println("Sueldo básico: " + sueldo);
            System.out.println("Seguro Social: " + seguro);

            entrada.nextLine();

        } while (contador < num_empleados);

        double promedioEdad = (double) sumaEdades / num_empleados;

        System.out.println("\n========== RESULTADOS ==========");

        System.out.println("Venezolanos tipo 1: " + totalVenezolanosTipo1);
        System.out.println("Venezolanos tipo 2: " + totalVenezolanosTipo2);
        System.out.println("Venezolanos tipo 3: " + totalVenezolanosTipo3);

        System.out.println("Extranjeros con edad impar: " + extranjerosEdadImpar);

        System.out.println("Promedio de edad: " + promedioEdad);

        System.out.println("Total general a pagar en sueldos: " + totalSueldos);
    }
}