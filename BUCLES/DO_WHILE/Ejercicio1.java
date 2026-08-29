/* Sea N y K dos enteros positivos, con K < N. Se desea escribir un programa que escriba el valor de
N,N-1,N-2,..., y así sucesivamente hasta llegar al valor de K. */

package BUCLES.DO_WHILE;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        int N, K;
        Scanner sc = new Scanner (System.in);
        System.out.println( "Ingrese el valor de K: ");
        K = sc.nextInt();
        System.out.println("Ingrese el valor de N: ");
        N = sc.nextInt();
        do {
            int N1 = N--;
            int N2 = N-=2;
            K++;
            System.out.println("valor de N1: " + N1);
            System.out.println("valor de N2: " + N2);
            System.out.println("valor de K: " + K);
        }
        while (K < N);

    }
}