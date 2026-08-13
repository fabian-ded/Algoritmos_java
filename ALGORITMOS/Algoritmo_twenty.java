package ALGORITMOS;
/* Calcule qué tanto por ciento anual cobraron por un préstamo de Bolívares X, si se pagaron Bolívares
Y de intereses en 4 años. La fórmula del interés es:
Capital. Tiempo. Razón
I = ------------------------------
100 */

public class Algoritmo_twenty {
    public static void main(String[] args) {

        double capital;
        double intereses;
        double tiempo = 4;
        double razon;

        System.out.println("Ingrese el valor del préstamo: ");
        String entradaCapital = System.console().readLine();
        capital = Double.parseDouble(entradaCapital.replace(".", ""));

        System.out.println("Ingrese el valor de los intereses pagados en los 4 años: ");
        String entradaIntereses = System.console().readLine();
        intereses = Double.parseDouble(entradaIntereses.replace(".", ""));

        razon = (intereses * 100) / (capital * tiempo);

        System.out.println("El porcentaje anual cobrado fue de: " + razon + "%");
    }
}