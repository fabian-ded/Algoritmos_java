/* Escriba un algoritmo para producir una tabla de conversión de temperatura para convertir valores
en grados Fahrenheit a su equivalente en grados Celsius, grados Kelvin y grados Rankine.
Las ecuaciones de conversión son:
C = 5(F-32) / 9
R = F + 459.67
K = C + 273.15
Donde F = temperatura en grados Fahrenheit
C = temperatura en grados Celsius
R = temperatura en grados Rankine
K = temperatura en grados Kelvin
Haga que el programa imprima encabezados para cada columna en la tabla.
Datos muestra:
de 28 a 54 oF en intervalos de 1 oF
de 450 a 950 oF en intervalos de 50 oF
de –50 a 250 oF en intervalos de 10 oF */

package BUCLES.DO_WHILE;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        double F,C,R,K;
        int fin = 0;
        Scanner Entrada = new Scanner(System.in);
        System. out. println("Ingnese La tempenatura en Fahrenheit: ");
        F = Entrada.nextDouble();
        C = 5*(F-32) /9;
        R = F+459.67;
        K = C + 273.15;
        do {
            fin++;
            System.out.println("La temperatura en Celsius: " + C);
            System.out.println("La temperatuna en Rankine: " + R);
            System.out.println("La temperatura en Kelvin: " + K);
        }
            while (fin == 0);
    }
}
