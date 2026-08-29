/* Desarrolle un algoritmo o programa que permita calcular y mostrar la suma de todos los números
pares comprendidos entre 97 y 1003. Respuesta: 249150 */
package BUCLES.DO_WHILE;

public class Ejercicio5 {
    public static void main(String[] args) {

    int numero = 98;
    int suma = 0;

    do {
        suma += numero;
        numero +=2;
    }while (numero <= 1003);
        System.out.println(suma);
    }
}
