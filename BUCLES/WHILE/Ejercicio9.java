package BUCLES.WHILE;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a = 0, i = 0, o = 0;
        int preguntas = 0;
        double estandar = 0;
        double guardador = 0;
        double estandarmenor = 0;
        double por_mayor = 0;
        double por_menor = 0;
        int ubi1 = 0;
        int ubi2 = 0;

        while (i <= 3){

            System.out.println("Cuestionario numero " + i);
            int e = 0;
            while (e <= 5) {
                System.out.println("Pregunta numero " + e);
                System.out.println("Cuanto puntaje tubo en la pregunta 1:");
                int pre1 = entrada.nextInt();
                System.out.println("Cuanto puntaje tubo en la pregunta 2:");
                int pre2 = entrada.nextInt();
                System.out.println("Cuanto puntaje tubo en la pregunta 3:");
                int pre3 = entrada.nextInt();
                System.out.println("Cuanto puntaje tubo en la pregunta 4:");
                int pre4 = entrada.nextInt();
                System.out.println("Cuanto puntaje tubo en la pregunta 5:");
                int pre5 = entrada.nextInt();

                guardador += pre1 + pre2 + pre3 + pre4 + pre5;
                preguntas = pre1 + pre2 + pre3 + pre4 + pre5;

                e++;
            }

            por_mayor = (double) preguntas / e;
            if (por_mayor > estandar) {
                estandar = por_mayor;
                ubi1 = i;
            }

            por_menor = (double) preguntas / e;
            if (por_menor < estandarmenor) {
                estandarmenor = por_menor;
                ubi2 = i;
            }

            if (por_menor < 3) {
                a++;
            }

            if (por_mayor > 4) {
                o++;
            }

            i++;
        };
        System.out.println("El promedio de todos los cuestionarios es de: " + guardador);
        System.out.println("El promedio mas alto obtenido es de: " + estandar + " y su ubicacion es " + ubi1);
        System.out.println("El promedio mas bajo obtenido es de: " + estandarmenor + " y su ubicacion es " + ubi2);

        double prom_menor = ((double)i/a)/100;
        System.out.println("El promedio de cuestionarios que tuvieron menor que 3 es :" + prom_menor);

        double prom_mayor = ((double)i*o)/100;
        System.out.println("El promedio de cuestionarios que tuvieron mayor de 4,5 es :" + prom_mayor);
    }
}
