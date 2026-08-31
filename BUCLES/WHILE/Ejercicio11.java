package BUCLES.WHILE;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int conteo = 0;

        System.out.println("Ingrese el numero a dividir: ");
        numero = entrada.nextInt();

        while (numero - 2 >= 0){
            conteo++;
            numero -= 2;
            System.out.println("Numero en division: " + numero);
        }
        System.out.println("la division es: " + conteo);
    }
}
