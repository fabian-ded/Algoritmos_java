package BUCLES.WHILE;

public class Ejercicio19 {
    public static void main(String[] args) {

        double suma = 0;
        double termino = 1;
        int cantidadTerminos = 0;

        while (suma + termino <= 1.99) {

            suma += termino;
            cantidadTerminos++;

            termino /= 2;
        }

        System.out.println("Número de términos: " + cantidadTerminos);
        System.out.println("Valor de la suma: " + suma);
    }
}
