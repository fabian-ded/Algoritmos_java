/* Una empresa está interesada en automatizar el proceso anual de cálculo de intereses de mora y de
descuentos en el cobro de las facturas de los clientes a crédito. Para ello la empresa utiliza los
siguientes criterios:
a. Si la factura se paga se paga 60 días después de haber realizado la compra se cobra un
interés de mora del 8% sobre el monto de la factura.
b. Si la factura se paga entre 31 y 59 días después de haber realizado la compra se cobra un
interés de mora del 6% sobre el monto de la factura.
c. Si la factura se paga antes de los 15 días de haber realizado la compra se hace un descuento
del 2% sobre el monto de la factura.

Realice un algoritmo que lea los datos de las facturas por pantalla e imprima para cada factura el
número, nombre del cliente, el monto a cancelar, el monto a pagar por interés de mora y monto
descontado por pronto pago.
Los datos de cada factura son: Número de factura (num-fac), nombre del cliente (num-cli), monto de
la factura (mon-fac), fecha de compra (fec-com) y fecha de pago (fec-pag). */

package BUCLES.DO_WHILE;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numFactura;
        String nombreCliente;
        double montoFactura;
        int dias;

        double interesMora;
        double descuento;
        double montoCancelar;

        String continuar;

        do {

            System.out.println("\n===== DATOS DE LA FACTURA =====");

            System.out.println("Ingrese el número de factura:");
            numFactura = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Ingrese el nombre del cliente:");
            nombreCliente = entrada.nextLine();

            System.out.println("Ingrese el monto de la factura:");
            montoFactura = entrada.nextDouble();

            System.out.println("Ingrese los días transcurridos entre la compra y el pago:");
            dias = entrada.nextInt();

            interesMora = 0;
            descuento = 0;

            if (dias >= 60) {

                interesMora = montoFactura * 0.08;

            } else if (dias >= 31 && dias <= 59) {

                interesMora = montoFactura * 0.06;

            } else if (dias < 15) {

                descuento = montoFactura * 0.02;
            }

            montoCancelar = montoFactura + interesMora - descuento;

            System.out.println("\n===== RESULTADO =====");
            System.out.println("Número de factura: " + numFactura);
            System.out.println("Cliente: " + nombreCliente);
            System.out.println("Monto de la factura: $" + montoFactura);
            System.out.println("Interés de mora: $" + interesMora);
            System.out.println("Descuento por pronto pago: $" + descuento);
            System.out.println("Monto a cancelar: $" + montoCancelar);

            entrada.nextLine();

            System.out.println("\n¿Desea ingresar otra factura? (si/no)");
            continuar = entrada.nextLine();

        } while (continuar.equalsIgnoreCase("si"));
    }
}
