/* Calcular el término doceavo y la suma de los doce primeros términos de la sucesión: 6, 11, 16, 21.
Respuesta: a12=61, suma=402. */

package BUCLES.DO_WHILE;

public class Ejercicio6 {
    public static void main(String[] args){
        int termino = 6;
        int contador = 1;
        int suma = 0;

        do {
            suma += termino;
            termino += 5;
            contador++;
        }while (contador <=12);
        System.out.println("El termino doceavo es: " + (termino-5));
        System.out.println("La suma de los 12 terminos es: " + suma);
    }
}
