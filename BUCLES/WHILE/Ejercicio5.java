package BUCLES.WHILE;

public class Ejercicio5 {
    public static void main(String[] args) {

        int numero = 98;
        int suma = 0;

        while (numero <= 1003){
            suma += numero;
            numero +=2;
        }
        System.out.println(suma);
    }
}
