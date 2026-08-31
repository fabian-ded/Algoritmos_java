package BUCLES.WHILE;

public class Ejercicio2 {
    public static void main(String[] args) {

        int numero = 1;

        while (numero < 100) {
            System.out.println(numero);
            numero += 2;
            if (numero % 7 == 0) {
                numero += 2;
            }
        }
    }
}