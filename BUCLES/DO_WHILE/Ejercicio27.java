/* 72.Conociendo la masa y distancia de dos cuerpos se puede determinar la Fuerza de atracción que se
ejerce entre ambos. Se desea determinar las fuerzas de atracción ejercida entre la tierra y diversos

1
4

satélites ubicados a distintas alturas. Para lo cual la NASA le ha solicitado a usted construir un
programa que responda a los siguientes requerimientos:
a) Cuál es la mayor y menor fuerza de atracción ejercida por los satélites en estudio
b) La fuerza de atracción promedio ejercida por los satélites en estudio
c) La mayor masa de todos los satélites estudiados
d) La masa promedio de los satélites
e) La menor y mayor altura de los satélites
La fórmula para determinar la Fuerza de atracción es:

F = G m M
r
2

donde:
m: masa satélite;
M: Masa tierra (5,97 * 10 24 Kg);
r: distancia de los cuerpos;
G: Constante Gravitatoria (6,67259 * 10-11 N*m2
)
Kg2

Considere la siguiente muestra para realizar la prueba del Programa:
Satélite País Masa Altura
Kg. Mts
Canada 1 Canadá 8.300 31.200.000
Alfa 1 Chile 5.500 36.000.000
Boby 4 EE.UU. 12.000 33.450.000
Che 3 Argentina 3.350 34.200.000 */

package BUCLES.DO_WHILE;

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

        do {

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

            // Mayor y menor fuerza
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

        } while (contador < cantidadSatélites);

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
