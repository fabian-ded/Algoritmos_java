package ALGORITMOS;
/* Calcule qué tanto por ciento anual cobraron por un préstamo de Bolívares X, si se pagaron Bolívares
Y de intereses en 4 años. La fórmula del interés es:
Capital. Tiempo. Razón
I = ------------------------------
100 */

public class Algoritmo_twenty {
    public static void main(String[] args) {
        
        double Capital;
        double Tiempo = 0.4;
        double Razon;

        System.out.println("valor que pagaste en los 4 años: ");
        String entrada = System.console().readLine();
        Capital = Double.parseDouble(entrada.replace(".", ""));

        double intereses = Capital* Tiempo;
        

    }
}