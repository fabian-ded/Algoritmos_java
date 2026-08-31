package BUCLES.WHILE;

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

        String continuar = "si";

        while (continuar.equalsIgnoreCase("si")) {

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
        }
    }
}