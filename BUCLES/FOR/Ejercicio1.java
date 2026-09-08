package BUCLES.FOR;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        int N, K;
        Scanner sc = new Scanner (System.in);
        System.out.println( "Ingrese el valor de K: ");
        K = sc.nextInt();
        System.out.println("Ingrese el valor de N: ");
        N = sc.nextInt();

        for (K=0; K < N; K++) {
            int N1 = N--;
            int N2 = N -= 2;
            System.out.println("valor de N1: " + N1);
            System.out.println("valor de N2: " + N2);
        }
    }
}