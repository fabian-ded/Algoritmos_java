package ALGORITMOS;
/* Determine cuánto dinero hay en un banco que contiene N1 billetes de 50000, N2 billetes de 20000,
N3 billetes de 10000, N4 billetes de 5000, N5 billetes de 2000, N6 billetes 1000, N7 billetes de 500 y
N8 billetes de 100. */

public class Algoritmo_trirteen {
    public static void main(String[] args) {

        double N1;
        double N2;
        double N3;
        double N4;
        double N5;
        double N6;
        double N7;
        double N8;

        System.out.println("Ingresar cantidad de billetes de 50000: ");
        N1 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar cantidad de billetes de 20000: ");
        N2 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar cantidad de billetes de 10000: ");
        N3 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar cantidad de billetes de 5000: ");
        N4 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar cantidad de billetes de 2000: ");
        N5 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar cantidad de billetes de 1000: ");
        N6 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar cantidad de billetes de 500: ");
        N7 = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar cantidad de billetes de 100: ");
        N8 = Double.parseDouble(System.console().readLine());

        double dinero = (N1 * 50000) + (N2 * 20000) + (N3 * 10000) + (N4 * 5000) + (N5 * 2000) + (N6 * 1000) + (N7 * 500) + (N8 * 100);

        System.out.println("El dinero total que hay en el banco es: " + dinero);
    }
}