/* 69. Dos números A y B son amigos, cuando la suma de los divisores menores que A es igual a B, al mismo
tiempo cuando la suma de los divisores menores que B es igual a A. Los dos menores números amigos
son 220 y 284, debido a que:
a. divisores de 220 1+2+4+5+10+11+20+22+44+45+110 = 284
b. divisores de 284 1+2+4+71+142 = 220
c. los siguientes pares de amigos son: 1184 y 1210; 2620 y 2924; 5020 y 5564, etc. */

package BUCLES.DO_WHILE;

public class Ejercicio24 {

    public static void main(String[] args) {

        int numero = 2;
        int encontrados = 0;

        do {

            int divisor = 1;
            int sumaA = 0;

            // Buscar divisores de A
            do {

                if (numero % divisor == 0) {
                    sumaA += divisor;
                }

                divisor++;

            } while (divisor < numero);

            int B = sumaA;

            // Evitar comprobar el mismo número consigo mismo
            if (B > numero) {

                int divisorB = 1;
                int sumaB = 0;

                // Buscar divisores de B
                do {

                    if (B % divisorB == 0) {
                        sumaB += divisorB;
                    }

                    divisorB++;

                } while (divisorB < B);

                // Comprobar si son amigos
                if (sumaB == numero) {

                    System.out.println(
                            "Par de números amigos: "
                                    + numero + " y " + B
                    );

                    encontrados++;
                }
            }

            numero++;

        } while (encontrados < 5);
    }
}
