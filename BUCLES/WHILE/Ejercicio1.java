package BUCLES.WHILE;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int N, K;
        Scanner sc = new Scanner (System.in);
        System.out.println( "Ingrese el valor de K: ");
        K = sc.nextInt();
        System.out.println("Ingrese el valor de N: ");
        N = sc.nextInt();

        while ( K < N){
            int N1 = N--;
            int N2 = N-2;
            K++;
            System.out.println("valor de N1: " + N1);
            System.out.println("valor de N2: " + N2);
            System.out.println("valor de K: " + K);
        };

    }
}
