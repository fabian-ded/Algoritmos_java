package ALGORITMOS;
/* Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto
deberá pagar finalmente por su compra. */
public class Algoritmo_four {
    public static void main(String[] args) {
        int descuento = 15;
        double valor_compra;
        System.out.println("Cual es el valor total de la compra?: ");
        valor_compra = Double.parseDouble(System.console().readLine());
        double descuento_venta = (valor_compra/descuento);
        double total = (valor_compra-descuento_venta);
        System.out.println("El valor a pagar con descuento es: " + total);
    }
}