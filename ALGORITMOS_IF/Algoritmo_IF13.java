/* Dada una cantidad entera de Bolívares, desarrolle un algoritmo que permita desglosar dicha
cantidad en los billetes de curso legal en el País. Recuerde que estos son: 50000, 20000, 10000,
5000, 2000, 1000, 500, 100, 50, 20, 10. */
package ALGORITMOS_IF;

public class Algoritmo_IF13 {
    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de dinero: ");
        int cantidad = Integer.parseInt(System.console().readLine());

        int caben1 = cantidad;
        int caben2 = 0;
        int caben3 = 0;
        int caben4 = 0;
        int caben5 = 0;
        int caben6 = 0;
        int caben7 = 0;
        int caben8 = 0;
        int caben9 = 0;
        int caben10 = 0;
        int caben11 = 0;

        if (caben1 >= 50000) {
            int billetes = caben1 / 50000;
            caben2 = caben1 - (billetes * 50000);

            System.out.println("Billetes de 50000: " + billetes);
        } else {
            caben2 = caben1;
        }

        if (caben2 >= 20000) {
            int billetes = caben2 / 20000;
            caben3 = caben2 - (billetes * 20000);

            System.out.println("Billetes de 20000: " + billetes);
        } else {
            caben3 = caben2;
        }

        if (caben3 >= 10000) {
            int billetes = caben3 / 10000;
            caben4 = caben3 - (billetes * 10000);

            System.out.println("Billetes de 10000: " + billetes);
        } else {
            caben4 = caben3;
        }

        if (caben4 >= 5000) {
            int billetes = caben4 / 5000;
            caben5 = caben4 - (billetes * 5000);

            System.out.println("Billetes de 5000: " + billetes);
        } else {
            caben5 = caben4;
        }

        if (caben5 >= 2000) {
            int billetes = caben5 / 2000;
            caben6 = caben5 - (billetes * 2000);

            System.out.println("Billetes de 2000: " + billetes);
        } else {
            caben6 = caben5;
        }

        if (caben6 >= 1000) {
            int billetes = caben6 / 1000;
            caben7 = caben6 - (billetes * 1000);

            System.out.println("Billetes de 1000: " + billetes);
        } else {
            caben7 = caben6;
        }

        if (caben7 >= 500) {
            int billetes = caben7 / 500;
            caben8 = caben7 - (billetes * 500);

            System.out.println("Billetes de 500: " + billetes);
        } else {
            caben8 = caben7;
        }

        if (caben8 >= 100) {
            int billetes = caben8 / 100;
            caben9 = caben8 - (billetes * 100);

            System.out.println("Billetes de 100: " + billetes);
        } else {
            caben9 = caben8;
        }

        if (caben9 >= 50) {
            int billetes = caben9 / 50;
            caben10 = caben9 - (billetes * 50);

            System.out.println("Billetes de 50: " + billetes);
        } else {
            caben10 = caben9;
        }

        if (caben10 >= 20) {
            int billetes = caben10 / 20;
            caben11 = caben10 - (billetes * 20);

            System.out.println("Billetes de 20: " + billetes);
        } else {
            caben11 = caben10;
        }

        if (caben11 >= 10) {
            int billetes = caben11 / 10;
            caben11 = caben11 - (billetes * 10);

            System.out.println("Billetes de 10: " + billetes);
        }

        System.out.println("Dinero restante: " + caben11);
    }
}
