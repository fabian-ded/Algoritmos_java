package BUCLES.WHILE;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {

        double deuda = 12775;
        double pago = 100;
        double aumento = 125;
        double pendiente = deuda;

        int numeroPago = 0;

        System.out.println("========== TABLA DE PAGOS ==========");
        System.out.println("Pago\tMonto\tPendiente");

        while (pendiente > 0) {

            numeroPago++;

            // Si el pago supera la deuda, se paga solamente lo pendiente
            if (pago > pendiente) {
                pago = pendiente;
            }

            pendiente -= pago;

            System.out.println(
                    numeroPago + "\t"
                            + pago + "\t"
                            + pendiente
            );

            pago += aumento;
        }

        System.out.println("\nNúmero de pagos: " + numeroPago);
        System.out.println("Monto del último pago: " + (pago - aumento));
    }
}
