/* Dados los datos A, B, C y D que representan números enteros; escriba un algoritmo que calcule el
resultado de las siguientes expresiones:
Si D=0 (A-C)2
Si D>0 (A-B )3
D */
package ALGORITMOS_IF;

public class Algoritmo_IF3 {
    public static void main(String[] args) {
        
        double A,B,C,D;

        System.out.println("Ingrese el numero para A: ");
        A = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el numero para B: ");
        B = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el numero para C: ");
        C = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el numero para D: ");
        D = Integer.parseInt(System.console().readLine());

        if(D==0){
            double cero = (A-C)*(A-C);
            System.out.println("El resultado es: " + cero);
        }else{
            double uno = ((A-B)*(A-B)*(A-B))/D;
            System.out.println("El resultado es: " + uno);
        }

    }
}
