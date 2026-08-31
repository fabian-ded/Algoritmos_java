package BUCLES.WHILE;
 import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int multiplicador;
        int multiplicando;
        int suma = 0;

        System.out.println("Ingrese el primer número:");
        multiplicador = entrada.nextInt();

        System.out.println("Ingrese el segundo número:");
        multiplicando = entrada.nextInt();

        while (multiplicador >= 1) {

            if (multiplicador % 2 != 0) {
                suma += multiplicando;
            }

            multiplicador /= 2;
            multiplicando *= 2;
        }

        System.out.println("El resultado de la multiplicación es: " + suma);
    }
}
