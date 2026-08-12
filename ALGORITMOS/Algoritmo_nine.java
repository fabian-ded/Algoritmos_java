package ALGORITMOS;
/* Calcular el salario neto de un trabajador en función del número de horas trabajadas, el precio de la
hora y considerando un descuento fijo al sueldo base por concepto de impuestos del 20%. */

public class Algoritmo_nine {
    public static void main(String[] args) {
        int horas;
        double precio_horas;

        System.out.println("Cuantas horas trabajo?: ");
        horas = Integer.parseInt(System.console().readLine());
        System.out.println("Cuantas horas trabajo?: ");
        precio_horas = Double.parseDouble(System.console().readLine());

        double valor_trabajado = horas*precio_horas;
        double descuento_total = valor_trabajado*0.20;

        System.out.println("Precio total de horas trabajadas: " + valor_trabajado );
        System.out.println("Valor final a pagar con impuestos: " + descuento_total);

    }
}