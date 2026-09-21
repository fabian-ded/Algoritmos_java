package BUCLES.FOR;

public class Ejercicio6 {
    public static void main(String[] args){

        int termino = 6;
        int suma = 0;
        for (int contador = 1; contador <= 12; contador++){
            suma += termino;
            termino += 5;
        }
        System.out.println("El termino doceavo es: " + (termino-5));
        System.out.println("La suma de los 12 terminos es: " + suma);
    }
}
