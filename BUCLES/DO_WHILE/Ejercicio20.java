/* Calcular el sueldo neto de los trabajadores de una compañía sabiendo que este depende de los
siguientes datos:
• sueldo básico mensual 100000 si es obrero
• sueldo básico mensual 165500 si es administrativo
• sueldo básico mensual 250000 si es ejecutivo Las asignaciones y deducciones son:
• aporte por cada hijo hasta 5 hijos 10% del sueldo básico
• aporte por asistencia superior al 95% de los 30 días del mes 5% del sueldo básico.
• Deducción del 10% del sueldo básico para la caja de ahorros.
• Deducción para el seguro social 2% del sueldo básico
Por cada empleado debe salir un registro con el nombre y cédula, sueldo básico, aporte a la Caja de
Ahorros, seguro social y sueldo neto. */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre;
        String cedula;
        int tipoEmpleado;
        int hijos;
        int diasAsistidos;

        double sueldoBasico;
        double aporteHijos;
        double aporteAsistencia;
        double cajaAhorros;
        double seguroSocial;
        double sueldoNeto;

        String continuar;

        do {

            System.out.println("\n========== DATOS DEL EMPLEADO ==========");

            System.out.println("Ingrese el nombre:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la cedula:");
            cedula = entrada.nextLine();

            System.out.println("Ingrese el tipo de empleado:");
            System.out.println("1 = Obrero");
            System.out.println("2 = Administrativo");
            System.out.println("3 = Ejecutivo");
            tipoEmpleado = entrada.nextInt();

            System.out.println("Ingrese la cantidad de hijos:");
            hijos = entrada.nextInt();

            System.out.println("Ingrese los días asistidos de los 30 días:");
            diasAsistidos = entrada.nextInt();

            // Sueldo básico según el tipo de empleado
            switch (tipoEmpleado) {

                case 1:
                    sueldoBasico = 100000;
                    break;

                case 2:
                    sueldoBasico = 165500;
                    break;

                case 3:
                    sueldoBasico = 250000;
                    break;

                default:
                    sueldoBasico = 0;
                    break;
            }

            // Aporte por hijos
            if (hijos > 5) {
                hijos = 5;
            }

            aporteHijos = sueldoBasico * 0.10 * hijos;

            // Aporte por asistencia superior al 95%
            if (diasAsistidos > 28.5) {
                aporteAsistencia = sueldoBasico * 0.05;
            } else {
                aporteAsistencia = 0;
            }

            // Deducciones
            cajaAhorros = sueldoBasico * 0.10;

            seguroSocial = sueldoBasico * 0.02;

            // Sueldo neto
            sueldoNeto = sueldoBasico
                    + aporteHijos
                    + aporteAsistencia
                    - cajaAhorros
                    - seguroSocial;

            // Registro del empleado
            System.out.println("\n========== REGISTRO ==========");

            System.out.println("Nombre: " + nombre);
            System.out.println("Cedula: " + cedula);
            System.out.println("Sueldo básico: $" + sueldoBasico);
            System.out.println("Aporte por hijos: $" + aporteHijos);
            System.out.println("Aporte por asistencia: $" + aporteAsistencia);
            System.out.println("Caja de ahorros: $" + cajaAhorros);
            System.out.println("Seguro social: $" + seguroSocial);
            System.out.println("Sueldo neto: $" + sueldoNeto);

            entrada.nextLine();

            System.out.println("\n¿Desea ingresar otro empleado? (si/no)");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("si"));
    }
}
