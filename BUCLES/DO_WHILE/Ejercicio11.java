/* Efectuar la división de dos números enteros, utilizando el método de las restas sucesivas. Observe
el siguiente ejemplo:
a. Dividir 8 entre 2
b. 8 – 2 = 6
c. 6 – 2 = 4 número de restas efectuadas es igual al cociente =4
d. 4 – 2 = 2
e. 2 – 2 = 0 resto de la división */

package BUCLES.DO_WHILE;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int conteo = 0;

        System.out.println("Ingrese el numero a dividir: ");
        numero = entrada.nextInt();

        do {
            conteo++;
            numero -= 2;
            System.out.println("Numero en division: " + numero);
        }while (numero - 2 >= 0);
        System.out.println("la division es: " + conteo);
    }
}
