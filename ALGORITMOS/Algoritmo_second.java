package ALGORITMOS;
//Suponga que un individuo decide invertir su capital en un banco y desea saber cuánto dinero ganará
//después de un mes si el banco paga a razón de 2% mensual.

public class Algoritmo_second {
    public static void main(String[] args) {
        int capital;
        double razon = 0.02;
        System.out.println("Ingrese su capital destinado: ");
        capital = Integer.parseInt(System.console().readLine());
        double ganancia = (capital * razon);
        System.out.println("Su ganancia es de: " + ganancia);
    }
}
