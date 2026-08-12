package ALGORITMOS;
/* Dada una cantidad en metros, se requiere que la convierta a pies y pulgadas, considerando lo
siguiente: 1 metro = 39.27 pulgadas; 1 pie = 12 pulgadas. */

public class Algoritmo_seven {
    public static void main(String[] args) {
        double metros;
        double pulgadas = 39.27;
        double pie = 12;
        System.out.println("Cuantos metros requiere convertir?: ");
        metros = Double.parseDouble(System.console().readLine());
        double conv_pulgadas = (metros*pulgadas);
        double conv_pie = (conv_pulgadas/pie);
        System.out.println("Las pulgadas son: " + conv_pulgadas);
        System.out.println("Los pies son: " + conv_pie);
    }
}