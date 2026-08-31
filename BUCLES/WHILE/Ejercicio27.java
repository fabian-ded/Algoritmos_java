package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        final double G = 6.67259e-11;
        final double MASA_TIERRA = 5.97e24;

        int cantidadSatélites;
        int contador = 0;

        String nombre;
        String pais;

        double masa;
        double altura;
        double fuerza;

        double sumaFuerzas = 0;
        double sumaMasas = 0;

        double mayorFuerza = 0;
        double menorFuerza = 0;

        double mayorMasa = 0;

        double mayorAltura = 0;
        double menorAltura = 0;

        System.out.println("Ingrese la cantidad de satélites:");
        cantidadSatélites = entrada.nextInt();

        while (contador < cantidadSatélites) {

            contador++;

            entrada.nextLine();

            System.out.println("\n========== SATÉLITE #" + contador + " ==========");

            System.out.println("Ingrese el nombre del satélite:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese el país:");
            pais = entrada.nextLine();

            System.out.println("Ingrese la masa del satélite en Kg:");
            masa = entrada.nextDouble();

            System.out.println("Ingrese la altura del satélite en metros:");
            altura = entrada.nextDouble();

            // Fórmula de la fuerza de atracción
            fuerza = (G * masa * MASA_TIERRA) / (altura * altura);

            System.out.println("Fuerza de atracción: " + fuerza + " N");

            // Acumuladores
            sumaFuerzas += fuerza;
            sumaMasas += masa;

            // Inicializar mayor y menor con el primer satélite
            if (contador == 1) {

                mayorFuerza = fuerza;
                menorFuerza = fuerza;

                mayorAltura = altura;
                menorAltura = altura;

            } else {

                if (fuerza > mayorFuerza) {
                    mayorFuerza = fuerza;
                }

                if (fuerza < menorFuerza) {
                    menorFuerza = fuerza;
                }

                if (altura > mayorAltura) {
                    mayorAltura = altura;
                }

                if (altura < menorAltura) {
                    menorAltura = altura;
                }
            }

            // Mayor masa
            if (masa > mayorMasa) {
                mayorMasa = masa;
            }
        }

        double promedioFuerza = sumaFuerzas / cantidadSatélites;
        double promedioMasa = sumaMasas / cantidadSatélites;

        System.out.println("\n========== RESULTADOS ==========");

        System.out.println("a) Mayor fuerza de atracción: "
                + mayorFuerza + " N");

        System.out.println("   Menor fuerza de atracción: "
                + menorFuerza + " N");

        System.out.println("b) Fuerza de atracción promedio: "
                + promedioFuerza + " N");

        System.out.println("c) Mayor masa de los satélites: "
                + mayorMasa + " Kg");

        System.out.println("d) Masa promedio de los satélites: "
                + promedioMasa + " Kg");

        System.out.println("e) Mayor altura: "
                + mayorAltura + " metros");

        System.out.println("   Menor altura: "
                + menorAltura + " metros");
    }
}
