package BUCLES.WHILE;

public class Ejercicio6 {
    public static void main(String[] args) {
        int termino = 6;
        int contador = 1;
        int suma = 0;

        while (contador <13){
            suma += termino;
            termino += 5;
            contador++;
        }
        System.out.println("El termino doceavo es: " + (termino-5));
        System.out.println("La suma de los 12 terminos es: " + suma);
    }
}
