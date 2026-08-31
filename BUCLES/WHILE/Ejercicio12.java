package BUCLES.WHILE;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double N;
        double X = 0.1;
        double RN = 0;
        double diferencia = 1;

        System.out.println("Ingrese un número positivo:");
        N = entrada.nextDouble();

        while (N <= 0) {
            System.out.println("El número debe ser positivo.");
            System.out.println("Ingrese un número positivo:");
            N = entrada.nextDouble();
        }

        while (diferencia >= 0.000001) {

            RN = (X + N / X) / 2;

            diferencia = Math.abs(X - RN);

            X = RN;
        }

        System.out.println("La raíz cuadrada de " + N + " es: " + RN);
    }
}
