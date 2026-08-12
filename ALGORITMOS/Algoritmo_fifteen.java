package ALGORITMOS;
/* Calcular y mostrar el monto total a pagar en un mes de luz eléctrica, teniendo como dato la lectura
anterior, la lectura actual y el costo por kilovatio. */

public class Algoritmo_fifteen {
    public static void main(String[] args) {

        double lectura_anterior;
        double lectura_actual;
        double costo_kilovatio;

        System.out.println("Ingresar lectura anterior: ");
        lectura_anterior = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar lectura actual: ");
        lectura_actual = Double.parseDouble(System.console().readLine());

        System.out.println("Ingresar costo por kilovatio: ");
        costo_kilovatio = Double.parseDouble(System.console().readLine());

        double kilovatios = lectura_actual - lectura_anterior;

        double monto_total = kilovatios * costo_kilovatio;

        System.out.println("Los kilovatios consumidos son: " + kilovatios);
        System.out.println("El monto total a pagar es: " + monto_total);
    }
}
